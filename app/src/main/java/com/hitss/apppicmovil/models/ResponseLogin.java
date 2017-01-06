package com.hitss.apppicmovil.models;

/**
 * Created by Tadeo-developer on 05/01/17.
 */

public class ResponseLogin {

    private String code;
    private String resultadoOperacion;
    private Detalle detalle;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResultadoOperacion() {
        return resultadoOperacion;
    }

    public void setResultadoOperacion(String resultadoOperacion) {
        this.resultadoOperacion = resultadoOperacion;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }
}
