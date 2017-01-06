package com.hitss.apppicmovil.ws;

import com.hitss.apppicmovil.utils.AesUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by hitss on 11/08/2016.
 */
public class ConexionWs {

    //TODO: Link de desarrollo http://10.108.156.115:7070/PicMovilWS/ o produccion http://200.57.141.35/PicMovilWS/
    public static final String IP_PRODUCCION = "http://200.57.141.35/PicMovilWS/";
    public static final String IP_DESARROLLO = "http://10.108.156.115:7070/PicMovilWS/";

    public static final String IP = IP_DESARROLLO;

    public static final String LOGIN = "Login.do";
    public static final String ACTIVIDAD_TECNICO = "ActividadTecnico.do";
    public static final String CERRAR_SESION = "CerrarSesion.do";

    public final static int GET = 1;
    public final static int POST = 2;

    public String makeServiceCall(String urlWebService, int peticionMetodo) {
        return this.makeServiceCall(urlWebService, peticionMetodo, null);
    }

    public String makeServiceCall(String urlWebService, int peticionMetodo, HashMap<String, String> parametros) {
        URL url;
        String response = "";
        try {
            url = new URL(urlWebService);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(400000); //Tiempo de espera después de 6.66666667 minutos
            httpURLConnection.setConnectTimeout(5000); //Tiempo de espera después de 5 segundos
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            if (peticionMetodo == POST) {
                httpURLConnection.setRequestMethod("POST");
            } else if (peticionMetodo == GET) {
                httpURLConnection.setRequestMethod("GET");
            }
            if (parametros != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "ISO-8859-1"));
                StringBuilder result = new StringBuilder();
                boolean first = true;
                AesUtils aesUtils = new AesUtils();

                for (Map.Entry<String, String> entry : parametros.entrySet()) {
                    if (first)
                        first = false;
                    else
                        result.append("&");
                    result.append(URLEncoder.encode(entry.getKey(), "ISO-8859-1"));
                    result.append("=");

                    //TODO: Cometar primera linea para servicios encriptados
                    /***********************************************************************************/
                    result.append(URLEncoder.encode(entry.getValue(), "ISO-8859-1"));
                    //result.append(URLEncoder.encode(aesUtils.encrypt(entry.getValue()), "ISO-8859-1"));
                    /***********************************************************************************/
                }
                if (first)
                    first = false;
                else
                    result.append("&");
                result.append(URLEncoder.encode("s", "ISO-8859-1"));
                result.append("=");
                result.append(URLEncoder.encode(aesUtils.getSaltEncrypted(), "ISO-8859-1"));

                writer.write(result.toString());
                System.out.println("URL ------ " + url + "?" + result.toString());
                writer.flush();
                writer.close();
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),"ISO-8859-1"));
                while ((line = br.readLine()) != null) {
                    response += line;
                }
                //TODO: Quitar cometario para servicios encriptados
                /**************DES ENCRIPTACION DE DATOS ***********************/
              /*  JSONObject jsonObjectResponseEncripted = new JSONObject(response);
                String saltEncrypted = jsonObjectResponseEncripted.getString("s");
                AesUtils aesUtils  = new AesUtils(saltEncrypted);
                response = aesUtils.decrypt(jsonObjectResponseEncripted.getString("d"));*/
                /******************************************************************/

            } else {
                response = "{\"resultadoOperacion\":-1,\"code\":\"ERROR_CONEXION\", \"descripcion\":\"SIN RESPUESTA\"}";
            }
        } catch (Exception e) {
            e.printStackTrace();
            response = "{\"resultadoOperacion\":-1,\"code\":\"ERROR_CONEXION\", \"descripcion\":\"Error de conexón: Servicio no disponible - Intenta más tarde.\"}";
        }
        return response;
    }

}
