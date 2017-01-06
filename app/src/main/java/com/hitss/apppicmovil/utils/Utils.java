package com.hitss.apppicmovil.utils;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by Tadeo Gonzalez on 03/01/2017.
 */

public class Utils {

    public static void vibrate(Context context,long miliseconds){
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(miliseconds);
    }

    public static void vibrate(Context context){
        vibrate(context,250);
    }
}
