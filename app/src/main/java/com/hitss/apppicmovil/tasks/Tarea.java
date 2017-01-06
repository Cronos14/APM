package com.hitss.apppicmovil.tasks;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;

import com.hitss.apppicmovil.interfaces.OnPostExecuteListener;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Tadeo Gonzalez on 21/12/2016.
 */

public abstract class Tarea extends AsyncTask<String,Void,JSONObject> {

    protected Activity context;
    protected String titulo;
    protected String descripcion;
    protected String endPoint;
    protected int method;
    protected OnPostExecuteListener onPostExecuteListener;
    protected Dialog dialog;
    protected HashMap<String, String> parametros;

    public Tarea(Activity context, String titulo, String descripcion, String endPoint, int method, HashMap<String, String> parametros){
        this.context = context;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.endPoint = endPoint;
        this.method = method;
        this.parametros = parametros;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog = ProgressDialog.show(context, titulo, descripcion);

    }

    @Override
    protected void onPostExecute(JSONObject resultado) {
        super.onPostExecute(resultado);

        if(onPostExecuteListener!=null){
            onPostExecuteListener.onPostExecute(resultado);
        }

        dialog.dismiss();

    }

    public void setOnPostExecuteListener(OnPostExecuteListener onPostExecuteListener){
        this.onPostExecuteListener = onPostExecuteListener;
    }

}
