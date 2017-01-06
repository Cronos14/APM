package com.hitss.apppicmovil.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.utils.Utils;

public class ConsultaFacilidadesActivity extends ChildActivity {

    private Toolbar toolbar;
    private Button buscar;
    private ImageView imgRefresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_facilidades);

        buscar = (Button)findViewById(R.id.btn_buscar);
        imgRefresh = (ImageView)findViewById(R.id.img_refresh);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
                Intent intent = new Intent(ConsultaFacilidadesActivity.this,GeneraOSActivity.class);
                startActivity(intent);
            }
        });

        imgRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
            }
        });
    }



}
