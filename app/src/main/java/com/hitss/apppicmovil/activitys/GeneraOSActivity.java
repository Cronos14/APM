package com.hitss.apppicmovil.activitys;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.adapters.GeneraOSAdapter;
import com.hitss.apppicmovil.models.ElementGeneraOS;
import com.hitss.apppicmovil.utils.Utils;

import java.util.ArrayList;

public class GeneraOSActivity extends ChildActivity {

    private Toolbar toolbar;

    private RecyclerView recycler;
    private GeneraOSAdapter<ElementGeneraOS> adapter;
    private ArrayList<ElementGeneraOS> data;

    private Button btnGenerarOS;
    private Button btnReiniciar;
    private ImageView imgCable;
    private EditText edtCable;
    private ImageView imgCheckCable;
    private boolean selectedCable;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genera_os);

        btnGenerarOS = (Button)findViewById(R.id.btn_generar_os);
        btnReiniciar = (Button)findViewById(R.id.btn_reiniciar);
        imgCable = (ImageView)findViewById(R.id.img_cable);
        edtCable = (EditText)findViewById(R.id.edt_cable);
        imgCheckCable = (ImageView)findViewById(R.id.img_check_cable);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

        //instance recycler 
        recycler = (RecyclerView)findViewById(R.id.recycler_genera_os);
        recycler.setHasFixedSize(true);

        data = new ArrayList<>();
        adapter = new GeneraOSAdapter<>(data,R.layout.row_genera_os);

        recycler.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recycler.getContext(),
                manager.getOrientation());
        //recycler.addItemDecoration(dividerItemDecoration);
        recycler.setItemAnimator(new DefaultItemAnimator());

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
                ElementGeneraOS elementTabMenuSelected = data.get(recycler.getChildAdapterPosition(view));

                if(elementTabMenuSelected.isSelected()){
                    elementTabMenuSelected.setSelected(false);
                }else{
                    for (ElementGeneraOS elementGeneraOS : data){
                        elementGeneraOS.setSelected(false);
                    }
                    elementTabMenuSelected.setSelected(true);

                    //disable campo de texto cable
                    disableCable();
                }


                adapter.notifyDataSetChanged();
            }
        });

        btnGenerarOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
            }
        });

        imgCheckCable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
                if(selectedCable){
                    disableCable();
                }else{
                    enableCable();
                }
            }
        });



        initTerminalDummy();
    }

    private void disableCable(){
        imgCable.setBackgroundDrawable(getResources().getDrawable(R.drawable.disable_icon));
        edtCable.setBackgroundColor(getResources().getColor(R.color.gris_custom));
        edtCable.setEnabled(false);
        imgCheckCable.setImageDrawable(getResources().getDrawable(R.drawable.circulo_sombra));
        selectedCable = false;
    }

    private void enableCable(){
        for (ElementGeneraOS elementGeneraOS : data){
            elementGeneraOS.setSelected(false);
        }
        adapter.notifyDataSetChanged();
        imgCable.setBackgroundDrawable(getResources().getDrawable(R.drawable.active_icon));
        edtCable.setBackgroundDrawable(getResources().getDrawable(R.drawable.borde_general_blanco));
        edtCable.setEnabled(true);
        imgCheckCable.setImageDrawable(getResources().getDrawable(R.drawable.circulo_check_azul));
        selectedCable = true;
    }

    private void initTerminalDummy(){
        ArrayList<ElementGeneraOS> elementsGeneraOS = new ArrayList<>();
        elementsGeneraOS.add(createElementGeneraOS("ASDASDASDASDASDAD-Q31231",true));
        elementsGeneraOS.add(createElementGeneraOS("SFODFIOSDFOISFJIO-435432",false));
        elementsGeneraOS.add(createElementGeneraOS("IFDJGIDFJIGDFJIWW-994823",false));
        elementsGeneraOS.add(createElementGeneraOS("KJDGJIDFGJIFDGJID-564522",false));
        elementsGeneraOS.add(createElementGeneraOS("LFOIDGHFDJJDIWJWQ-848584",false));

        data.addAll(elementsGeneraOS);
        adapter.notifyDataSetChanged();
    }

    private ElementGeneraOS createElementGeneraOS(String terminal, boolean selected){
        ElementGeneraOS elementGeneraOS = new ElementGeneraOS();
        elementGeneraOS.setSelected(selected);
        elementGeneraOS.setTerminal(terminal);
        return elementGeneraOS;
    }


}
