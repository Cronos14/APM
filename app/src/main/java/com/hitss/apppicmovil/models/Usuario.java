package com.hitss.apppicmovil.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tadeo-developer on 05/01/17.
 */

public class Usuario {
    private int transaccion;
    private String apPaterno;
    private int idUsrDivArea;
    private String apMaterno;
    private String nombreCompleto;
    private int statusPerfil;
    private String nombre;
    private int idPerfil;
    @SerializedName("id_filial")
    private String idFilial;
    private String descPerfil;
    private int division;
    private int idUsuario;
    private int usuCambiaPass;
    private boolean casoEspecial;
    private int ultimoAcceso;
    private int idRol;
    private int status;
    private int idDivision;
    private String usuIdUsuario;
    private boolean multidiv;
    private int idEmpresaB;
    private int idCategoria;
    private int idDivision2;
    private boolean correcto;
    private int idEmpresa;
    private int nss;
    private int idArea;
    private int passExpira;

    public int getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(int transaccion) {
        this.transaccion = transaccion;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public int getIdUsrDivArea() {
        return idUsrDivArea;
    }

    public void setIdUsrDivArea(int idUsrDivArea) {
        this.idUsrDivArea = idUsrDivArea;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getStatusPerfil() {
        return statusPerfil;
    }

    public void setStatusPerfil(int statusPerfil) {
        this.statusPerfil = statusPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(String idFilial) {
        this.idFilial = idFilial;
    }

    public String getDescPerfil() {
        return descPerfil;
    }

    public void setDescPerfil(String descPerfil) {
        this.descPerfil = descPerfil;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getUsuCambiaPass() {
        return usuCambiaPass;
    }

    public void setUsuCambiaPass(int usuCambiaPass) {
        this.usuCambiaPass = usuCambiaPass;
    }

    public boolean isCasoEspecial() {
        return casoEspecial;
    }

    public void setCasoEspecial(boolean casoEspecial) {
        this.casoEspecial = casoEspecial;
    }

    public int getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(int ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getUsuIdUsuario() {
        return usuIdUsuario;
    }

    public void setUsuIdUsuario(String usuIdUsuario) {
        this.usuIdUsuario = usuIdUsuario;
    }

    public boolean isMultidiv() {
        return multidiv;
    }

    public void setMultidiv(boolean multidiv) {
        this.multidiv = multidiv;
    }

    public int getIdEmpresaB() {
        return idEmpresaB;
    }

    public void setIdEmpresaB(int idEmpresaB) {
        this.idEmpresaB = idEmpresaB;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdDivision2() {
        return idDivision2;
    }

    public void setIdDivision2(int idDivision2) {
        this.idDivision2 = idDivision2;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getPassExpira() {
        return passExpira;
    }

    public void setPassExpira(int passExpira) {
        this.passExpira = passExpira;
    }
}
