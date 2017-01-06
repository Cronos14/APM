package com.hitss.apppicmovil.tasks;

import android.app.Activity;

import com.hitss.apppicmovil.ws.ConexionWs;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Tadeo Gonzalez on 21/12/2016.
 */

public class TareaGeneral extends Tarea {


    public TareaGeneral(Activity context, String titulo, String descripcion, String endPoint, int method, HashMap<String, String> parametros) {
        super(context, titulo, descripcion,endPoint,method, parametros);
    }

    @Override
    protected JSONObject doInBackground(String... strings) {
        ConexionWs conexionWs = new ConexionWs();
        try {
            return new JSONObject(conexionWs.makeServiceCall(ConexionWs.IP + endPoint, method, parametros));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


}
