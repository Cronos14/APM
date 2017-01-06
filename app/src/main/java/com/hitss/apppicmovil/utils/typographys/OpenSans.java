package com.hitss.apppicmovil.utils.typographys;

import android.graphics.Typeface;

import java.util.HashMap;

/**
 * Created by Tadeo Gonzalez on 04/01/2017.
 */

public class OpenSans {

    private static final String DIRECTORY_TYPEFACES = "typefaces/opensans/";

    public static final String BOLD = "BOLD";
    public static final String BOLD_ITALIC = "BOLD_ITALIC";
    public static final String EXTRA_BOLD = "EXTRA_BOLD";
    public static final String EXTRA_BOLD_ITALIC = "EXTRA_BOLD_ITALIC";
    public static final String ITALIC = "ITALIC";
    public static final String LIGHT = "LIGHT";
    public static final String LIGHT_ITALIC = "LIGHT_ITALIC";
    public static final String REGULAR = "REGULAR";
    public static final String SEMI_BOLD = "SEMI_BOLD";
    public static final String SEMI_BOLD_ITALIC = "SEMI_BOLD_ITALIC";



    private static final String BOLD_ASSET = DIRECTORY_TYPEFACES+"opensans-bold.ttf";
    private static final String BOLD_ITALIC_ASSET = DIRECTORY_TYPEFACES+"opensans-bold_italic.ttf";
    private static final String EXTRA_BOLD_ASSET = DIRECTORY_TYPEFACES+"opensans-extra_bold.ttf";
    private static final String EXTRA_BOLD_ITALIC_ASSET = DIRECTORY_TYPEFACES+"opensans-extra_bold_italic.ttf";
    private static final String ITALIC_ASSET = DIRECTORY_TYPEFACES+"opensans-italic.ttf";
    private static final String LIGHT_ASSET = DIRECTORY_TYPEFACES+"opensans-light.ttf";
    private static final String LIGHT_ITALIC_ASSET = DIRECTORY_TYPEFACES+"opensans-light_italic.ttf";
    private static final String REGULAR_ASSET = DIRECTORY_TYPEFACES+"opensans-regular.ttf";
    private static final String SEMI_BOLD_ASSET = DIRECTORY_TYPEFACES+"opensans-semi_bold.ttf";
    private static final String SEMI_BOLD_ITALIC_ASSET = DIRECTORY_TYPEFACES+"opensans-semi_bold_italic.ttf";



    public static final HashMap<String,String> typefaces = new HashMap<>();
    static{
        typefaces.put(BOLD,BOLD_ASSET);
        typefaces.put(BOLD_ITALIC,BOLD_ITALIC_ASSET);
        typefaces.put(EXTRA_BOLD,EXTRA_BOLD_ASSET);
        typefaces.put(EXTRA_BOLD_ITALIC,EXTRA_BOLD_ITALIC_ASSET);
        typefaces.put(ITALIC,ITALIC_ASSET);
        typefaces.put(LIGHT,LIGHT_ASSET);
        typefaces.put(LIGHT_ITALIC,LIGHT_ITALIC_ASSET);
        typefaces.put(REGULAR,REGULAR_ASSET);
        typefaces.put(SEMI_BOLD,SEMI_BOLD_ASSET);
        typefaces.put(SEMI_BOLD_ITALIC,SEMI_BOLD_ITALIC_ASSET);

    }


}
