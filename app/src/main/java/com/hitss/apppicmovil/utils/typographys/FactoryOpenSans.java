package com.hitss.apppicmovil.utils.typographys;

import android.content.res.AssetManager;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tadeo Gonzalez on 04/01/2017.
 */

public class FactoryOpenSans {

    private static FactoryOpenSans factoryOpenSans;
    private AssetManager am;
    private HashMap<String,Typeface> hashMap;

    private FactoryOpenSans(AssetManager am){
        this.am = am;
        hashMap = new HashMap<>();

        for(String keyTypeface : OpenSans.typefaces.keySet()){
            hashMap.put(keyTypeface,Typeface.createFromAsset(am,OpenSans.typefaces.get(keyTypeface)));
        }
    }

    public static FactoryOpenSans getInstance(AssetManager am){
        if(factoryOpenSans==null)
            factoryOpenSans = new FactoryOpenSans(am);

        return  factoryOpenSans;
    }

    public Typeface getTypeface(String nombre){
        return hashMap.get(nombre);
    }


}
