package com.hitss.apppicmovil.models;

import java.util.ArrayList;

/**
 * Created by Tadeo-developer on 05/01/17.
 */

public class Menu {

    private String mnsNombre;
    private int mnsSecuencia;
    private int mnsMenu;
    private ArrayList<Menu> hijos;

    public String getMnsNombre() {
        return mnsNombre;
    }

    public void setMnsNombre(String mnsNombre) {
        this.mnsNombre = mnsNombre;
    }

    public int getMnsSecuencia() {
        return mnsSecuencia;
    }

    public void setMnsSecuencia(int mnsSecuencia) {
        this.mnsSecuencia = mnsSecuencia;
    }

    public int getMnsMenu() {
        return mnsMenu;
    }

    public void setMnsMenu(int mnsMenu) {
        this.mnsMenu = mnsMenu;
    }

    public ArrayList<Menu> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Menu> hijos) {
        this.hijos = hijos;
    }
}
