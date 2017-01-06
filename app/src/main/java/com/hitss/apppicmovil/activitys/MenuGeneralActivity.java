package com.hitss.apppicmovil.activitys;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.adapters.MenuAdapter;
import com.hitss.apppicmovil.adapters.TabMenuAdapter;
import com.hitss.apppicmovil.models.ElementMenu;
import com.hitss.apppicmovil.models.ElementTabMenu;
import com.hitss.apppicmovil.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class MenuGeneralActivity extends GeneralActivity {

    private String elementSelected;
    private Toolbar toolbar;
    private ImageView imgHeader;
    private RecyclerView recyclerTabMenu;
    private TabMenuAdapter<ElementTabMenu> adapterTabMenu;
    private ArrayList<ElementTabMenu> dataTabMenu;

    private RecyclerView recyclerMenu;
    private MenuAdapter<ElementMenu> adapterMenu;
    private ArrayList<ElementMenu> dataMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_general);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            elementSelected = extras.getString(HomeActivity.KEY);
        }

        imgHeader = (ImageView)findViewById(R.id.img_header);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

        //instance recycler tab menu
        recyclerTabMenu = (RecyclerView)findViewById(R.id.recycler_tab_menu);
        recyclerTabMenu.setHasFixedSize(true);

        dataTabMenu = new ArrayList<>();
        adapterTabMenu = new TabMenuAdapter<>(dataTabMenu,R.layout.row_tab_menu);

        recyclerTabMenu.setAdapter(adapterTabMenu);

        recyclerTabMenu.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterTabMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Utils.vibrate(getBaseContext());
                ElementTabMenu elementTabMenuSelected = dataTabMenu.get(recyclerTabMenu.getChildAdapterPosition(view));

                for (ElementTabMenu elementTabMenu : dataTabMenu){
                    elementTabMenu.setSelected(false);

                }

                if(elementTabMenuSelected.getNombre().equalsIgnoreCase("TS Sitio")){
                    initOptionsFibraTsSitio();
                }else if(elementTabMenuSelected.getNombre().equalsIgnoreCase("Ordenes")){
                    initOptionsFibraCobreOrdenes();
                }else if(elementTabMenuSelected.getNombre().equalsIgnoreCase("Quejas")){
                    initOptionsFibraCobreQuejas();
                }

                elementTabMenuSelected.setSelected(true);
                adapterTabMenu.notifyDataSetChanged();

            }
        });




        //instance recycler menu
        recyclerMenu = (RecyclerView)findViewById(R.id.recycler_menu);
        recyclerMenu.setHasFixedSize(true);

        dataMenu = new ArrayList<>();
        adapterMenu = new MenuAdapter<>(dataMenu,R.layout.row_menu);

        recyclerMenu.setAdapter(adapterMenu);

        LinearLayoutManager managerMenu = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerMenu.setLayoutManager(managerMenu);
        recyclerMenu.setAdapter(adapterMenu);

        DividerItemDecoration dividerItemDecorationMenu = new DividerItemDecoration(recyclerMenu.getContext(),
                managerMenu.getOrientation());
        recyclerMenu.addItemDecoration(dividerItemDecorationMenu);
        recyclerMenu.setItemAnimator(new DefaultItemAnimator());

        adapterMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.vibrate(getBaseContext());
                Intent intent = new Intent(MenuGeneralActivity.this,ConsultaFacilidadesActivity.class);
                startActivity(intent);
            }
         });



    }

    @Override
    protected void onResume() {
        super.onResume();

        if(elementSelected.equals(HomeActivity.FIBRA)){

            imgHeader.setImageDrawable(getResources().getDrawable(R.drawable.menu_encabezado_fibra));
            initElementsTabMenuFibra();
            initOptionsFibraTsSitio();

        }else if(elementSelected.equals(HomeActivity.COBRE)){
            imgHeader.setImageDrawable(getResources().getDrawable(R.drawable.menu_encabezado_cobre));
            initElementsTabMenuCobre();
            initOptionsFibraCobreOrdenes();
        }
    }


    private void initElementsTabMenuFibra(){

        ArrayList<ElementTabMenu> elementsTabMenus = new ArrayList<>();
        elementsTabMenus.add(addElementTabMenu("TS Sitio",R.drawable.menu_ts_sitio_active,R.drawable.menu_ts_sitio_inactive));
        elementsTabMenus.add(addElementTabMenu("Ordenes",R.drawable.menu_ordenes_active,R.drawable.menu_ordenes_inactive));
        elementsTabMenus.add(addElementTabMenu("Quejas",R.drawable.menu_quejas_active,R.drawable.menu_quejas_inactive));

        dataTabMenu.clear();
        dataTabMenu.addAll(elementsTabMenus);
        dataTabMenu.get(0).setSelected(true);
        adapterTabMenu.notifyDataSetChanged();

    }

    private void initElementsTabMenuCobre(){

        ArrayList<ElementTabMenu> elementsTabMenus = new ArrayList<>();
        elementsTabMenus.add(addElementTabMenu("Ordenes",R.drawable.menu_ordenes_active,R.drawable.menu_ordenes_inactive));
        elementsTabMenus.add(addElementTabMenu("Quejas",R.drawable.menu_quejas_active,R.drawable.menu_quejas_inactive));

        dataTabMenu.clear();
        dataTabMenu.addAll(elementsTabMenus);
        dataTabMenu.get(0).setSelected(true);
        adapterTabMenu.notifyDataSetChanged();

    }





    private void initOptionsFibraTsSitio(){
        dataMenu.clear();

        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.key),"Facilidades","facilidades"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.news),"Despacho","despacho"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.gauge),"Aprovisionamiento","aprovisionamiento"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.analytics),"Consulta Estatus","consultaestatus"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.flag),"Liquidación","liquidacion"));

        adapterMenu.notifyDataSetChanged();
    }

    private void initOptionsFibraCobreOrdenes(){
        dataMenu.clear();

        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.news),"Despacho","despacho"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.gauge),"Aprovisionamiento","aprovisionamiento"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.analytics),"Consulta Estatus","consultaestatus"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.flag),"Liquidación","liquidacion"));

        adapterMenu.notifyDataSetChanged();
    }

    private void initOptionsFibraCobreQuejas(){
        dataMenu.clear();

        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.news),"Despacho","despacho"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.gauge),"Aprovisionamiento","aprovisionamiento"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.analytics),"Consulta Estatus","consultaestatus"));
        dataMenu.add(addElementMenu(BitmapFactory.decodeResource(getResources(),R.drawable.flag),"Liquidación","liquidacion"));

        adapterMenu.notifyDataSetChanged();
    }

    private Bitmap searchBitmap(String nombre){

        try {
            Log.e("AppActivity","buscando caracteristica: "+nombre);
            return BitmapFactory.decodeStream(getAssets().open("iconos_caracteristicas/"+nombre+".png"));
        } catch (IOException e) {
            return null;
        }
    }



    private ElementTabMenu addElementTabMenu(ElementTabMenu elementTabMenu){

        ElementTabMenu element = new ElementTabMenu();
        element.setFondo(getResources().getDrawable(R.drawable.circle_general));
        element.setIconActive(searchBitmap(elementTabMenu.getNombreIcono()));
        element.setNombre(elementTabMenu.getNombre());

        return element;

    }

    private ElementTabMenu addElementTabMenu(String nombre, int drawableActive, int drawableInactive){

        ElementTabMenu element = new ElementTabMenu();
        element.setNombre(nombre);
        element.setIconActive(BitmapFactory.decodeResource(getResources(),drawableActive));
        element.setIconInactive(BitmapFactory.decodeResource(getResources(),drawableInactive));

        return element;

    }

    private ElementMenu addElementMenu(Bitmap icono, String nombre, String nombreLocal){
        ElementMenu elementMenu = new ElementMenu();
        elementMenu.setIcono(icono);
        elementMenu.setNombre(nombre);
        elementMenu.setNombreLocal(nombreLocal);
        return elementMenu;
    }


}
