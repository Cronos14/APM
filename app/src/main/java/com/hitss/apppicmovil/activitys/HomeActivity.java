package com.hitss.apppicmovil.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.utils.Utils;
import com.hitss.apppicmovil.utils.typographys.FactoryOpenSans;
import com.hitss.apppicmovil.utils.typographys.OpenSans;

public class HomeActivity extends AppCompatActivity {

    public static final String KEY = "name";
    public static final String FIBRA = "Fibra";
    public static final String COBRE = "Cobre";
    private Toolbar toolbar;
    private ImageView imgFibra;
    private ImageView imgCobre;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgFibra = (ImageView)findViewById(R.id.img_fibra);
        imgCobre = (ImageView)findViewById(R.id.img_cobre);
        check = (Button)findViewById(R.id.btn_check);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolbar);

        FactoryOpenSans factoryOpenSans = FactoryOpenSans.getInstance(getAssets());
        check.setTypeface(factoryOpenSans.getTypeface(OpenSans.BOLD));
        imgFibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.vibrate(getBaseContext());
                Intent intent = new Intent(HomeActivity.this,MenuGeneralActivity.class);
                intent.putExtra(KEY,FIBRA);
                startActivity(intent);
            }
        });

        imgCobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.vibrate(getBaseContext());
                Intent intent = new Intent(HomeActivity.this,MenuGeneralActivity.class);
                intent.putExtra(KEY,COBRE);
                startActivity(intent);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
                if(check.getText().toString().equalsIgnoreCase("check-in")){
                    check.setText("check-out");
                }else if(check.getText().toString().equalsIgnoreCase("check-out")){
                    check.setText("check-in");
                }
            }
        });
    }
}
