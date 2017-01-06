package com.hitss.apppicmovil.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.models.ResponseLogin;
import com.hitss.apppicmovil.utils.Singleton;
import com.hitss.apppicmovil.utils.Utils;
import com.hitss.apppicmovil.utils.typographys.FactoryOpenSans;
import com.hitss.apppicmovil.utils.typographys.OpenSans;

public class LoginActivity extends AppCompatActivity {

    private TextView tvPic;
    private TextView tvMovil;
    private EditText edtUser;
    private EditText edtPassword;
    private Button btnLogin;

    private String JSONHard = "{\n" +
            "   \"code\":\"SUCCESS\",\n" +
            "   \"detalle\":{\n" +
            "      \"menus\":[\n" +
            "         {\n" +
            "            \"mnsNombre\":\"FIBRA\",\n" +
            "            \"mnsSecuencia\":1,\n" +
            "            \"hijos\":[\n" +
            "               {\n" +
            "                  \"mnsNombre\":\"TS_SITIO\",\n" +
            "                  \"mnsSecuencia\":1,\n" +
            "                  \"hijos\":[\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"FACILIDADES\",\n" +
            "                        \"mnsSecuencia\":1,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":307\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"DESPACHO\",\n" +
            "                        \"mnsSecuencia\":2,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":308\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"APROVISIONAMIENTO\",\n" +
            "                        \"mnsSecuencia\":3,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":309\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"CONSULTA_ESTATUS\",\n" +
            "                        \"mnsSecuencia\":4,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":310\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"LIQUIDACION\",\n" +
            "                        \"mnsSecuencia\":5,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":311\n" +
            "                     }\n" +
            "                  ],\n" +
            "                  \"mnsMenu\":302\n" +
            "               },\n" +
            "               {\n" +
            "                  \"mnsNombre\":\"ORDENES\",\n" +
            "                  \"mnsSecuencia\":2,\n" +
            "                  \"hijos\":[\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"DESPACHO\",\n" +
            "                        \"mnsSecuencia\":1,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":312\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"APROVISIONAMIENTO\",\n" +
            "                        \"mnsSecuencia\":2,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":313\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"CONSULTA_ESTATUS\",\n" +
            "                        \"mnsSecuencia\":3,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":314\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"LIQUIDACION\",\n" +
            "                        \"mnsSecuencia\":4,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":315\n" +
            "                     }\n" +
            "                  ],\n" +
            "                  \"mnsMenu\":303\n" +
            "               },\n" +
            "               {\n" +
            "                  \"mnsNombre\":\"QUEJAS\",\n" +
            "                  \"mnsSecuencia\":3,\n" +
            "                  \"hijos\":[\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"DESPACHO\",\n" +
            "                        \"mnsSecuencia\":1,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":316\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"APROVISIONAMIENTO\",\n" +
            "                        \"mnsSecuencia\":2,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":317\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"CONSULTA_ESTATUS\",\n" +
            "                        \"mnsSecuencia\":3,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":318\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"LIQUIDACION\",\n" +
            "                        \"mnsSecuencia\":4,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":319\n" +
            "                     }\n" +
            "                  ],\n" +
            "                  \"mnsMenu\":304\n" +
            "               }\n" +
            "            ],\n" +
            "            \"mnsMenu\":300\n" +
            "         },\n" +
            "         {\n" +
            "            \"mnsNombre\":\"COBRE\",\n" +
            "            \"mnsSecuencia\":1,\n" +
            "            \"hijos\":[\n" +
            "               {\n" +
            "                  \"mnsNombre\":\"ORDENES\",\n" +
            "                  \"mnsSecuencia\":1,\n" +
            "                  \"hijos\":[\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"DESPACHO\",\n" +
            "                        \"mnsSecuencia\":1,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":320\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"APROVISIONAMIENTO\",\n" +
            "                        \"mnsSecuencia\":2,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":321\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"CONSULTA_ESTATUS\",\n" +
            "                        \"mnsSecuencia\":3,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":322\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"LIQUIDACION\",\n" +
            "                        \"mnsSecuencia\":4,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":323\n" +
            "                     }\n" +
            "                  ],\n" +
            "                  \"mnsMenu\":305\n" +
            "               },\n" +
            "               {\n" +
            "                  \"mnsNombre\":\"QUEJAS\",\n" +
            "                  \"mnsSecuencia\":2,\n" +
            "                  \"hijos\":[\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"DESPACHO\",\n" +
            "                        \"mnsSecuencia\":1,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":324\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"APROVISIONAMIENTO\",\n" +
            "                        \"mnsSecuencia\":2,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":325\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"CONSULTA_ESTATUS\",\n" +
            "                        \"mnsSecuencia\":3,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":326\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"mnsNombre\":\"LIQUIDACION\",\n" +
            "                        \"mnsSecuencia\":4,\n" +
            "                        \"hijos\":[\n" +
            "\n" +
            "                        ],\n" +
            "                        \"mnsMenu\":327\n" +
            "                     }\n" +
            "                  ],\n" +
            "                  \"mnsMenu\":306\n" +
            "               }\n" +
            "            ],\n" +
            "            \"mnsMenu\":301\n" +
            "         }\n" +
            "      ],\n" +
            "      \"token\":{\n" +
            "         \"usuario\":\"TECNICO-66666666\",\n" +
            "         \"token\":\"a7c45769-b2e1-4be6-bae2-afa20cb84b04\"\n" +
            "      },\n" +
            "      \"usuario\":{\n" +
            "         \"transaccion\":0,\n" +
            "         \"apPaterno\":\"66666666\",\n" +
            "         \"idUsrDivArea\":0,\n" +
            "         \"apMaterno\":\"MOVIL\",\n" +
            "         \"nombreCompleto\":\"TECNICO 66666666 MOVIL\",\n" +
            "         \"statusPerfil\":0,\n" +
            "         \"nombre\":\"TECNICO\",\n" +
            "         \"idPerfil\":54,\n" +
            "         \"id_filial\":\"06\",\n" +
            "         \"descPerfil\":\"TECNICO FIBRA\",\n" +
            "         \"division\":0,\n" +
            "         \"idUsuario\":0,\n" +
            "         \"usuCambiaPass\":0,\n" +
            "         \"casoEspecial\":false,\n" +
            "         \"ultimoAcceso\":0,\n" +
            "         \"idRol\":0,\n" +
            "         \"status\":1,\n" +
            "         \"idDivision\":0,\n" +
            "         \"usuIdUsuario\":\"TECNICO-66666666\",\n" +
            "         \"multidiv\":false,\n" +
            "         \"idEmpresaB\":0,\n" +
            "         \"idCategoria\":0,\n" +
            "         \"idDivision2\":0,\n" +
            "         \"correcto\":true,\n" +
            "         \"idEmpresa\":0,\n" +
            "         \"nss\":0,\n" +
            "         \"idArea\":0,\n" +
            "         \"passExpira\":50\n" +
            "      }\n" +
            "   },\n" +
            "   \"resultadoOperacion\":0\n" +
            "}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvPic = (TextView) findViewById(R.id.tv_pic);
        tvMovil = (TextView) findViewById(R.id.tv_movil);
        edtUser = (EditText)findViewById(R.id.edt_user);
        edtPassword = (EditText)findViewById(R.id.edt_password);
        btnLogin = (Button)findViewById(R.id.btn_login);

        FactoryOpenSans factoryOpenSans = FactoryOpenSans.getInstance(getAssets());
        tvPic.setTypeface(factoryOpenSans.getTypeface(OpenSans.BOLD));
        tvMovil.setTypeface(factoryOpenSans.getTypeface(OpenSans.LIGHT));
        edtUser.setTypeface(factoryOpenSans.getTypeface(OpenSans.SEMI_BOLD));
        edtPassword.setTypeface(factoryOpenSans.getTypeface(OpenSans.SEMI_BOLD));
        btnLogin.setTypeface(factoryOpenSans.getTypeface(OpenSans.BOLD));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
                Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });


        Gson gson = new Gson();
        ResponseLogin responseLogin = gson.fromJson(JSONHard,ResponseLogin.class);
        Singleton.getInstance().setResponseLogin(responseLogin);
        Log.e("LoginActivity","token: "+ responseLogin.getDetalle().getUsuario().getIdFilial());



    }
}
