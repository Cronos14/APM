package com.hitss.apppicmovil.models;

import java.util.ArrayList;

/**
 * Created by Tadeo-developer on 05/01/17.
 */

public class Detalle {

    private Token token;
    private Usuario usuario;
    private ArrayList<Menu> menus;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }
}
