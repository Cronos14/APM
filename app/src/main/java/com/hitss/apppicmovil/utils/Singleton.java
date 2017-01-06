package com.hitss.apppicmovil.utils;

import com.hitss.apppicmovil.models.ResponseLogin;

/**
 * Created by Tadeo Gonzalez on 04/01/2017.
 */

public class Singleton {

    private static Singleton singleton;
    private ResponseLogin responseLogin;


    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton==null)
            singleton = new Singleton();
        return singleton;
    }

    public ResponseLogin getResponseLogin() {
        return responseLogin;
    }

    public void setResponseLogin(ResponseLogin responseLogin) {
        this.responseLogin = responseLogin;
    }
}
