package com.hitss.apppicmovil.adapters.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.models.ElementGeneraOS;
import com.hitss.apppicmovil.utils.typographys.FactoryOpenSans;
import com.hitss.apppicmovil.utils.typographys.OpenSans;

/**
 * Created by Tadeo Gonzalez on 03/01/2017.
 */

public class GeneraOSViewHolder extends ViewHolder {

    private ImageView image;
    private TextView name;
    private FactoryOpenSans factoryOpenSans;

    public GeneraOSViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.img_check);
        name = (TextView)itemView.findViewById(R.id.txt_terminal);
        factoryOpenSans = FactoryOpenSans.getInstance(itemView.getContext().getAssets());
        name.setTypeface(factoryOpenSans.getTypeface(OpenSans.SEMI_BOLD));
        name.setTextColor(itemView.getResources().getColor(R.color.negro_custom));
    }

    @Override
    public void bind(Object obj) {

        if(obj instanceof ElementGeneraOS){
            ElementGeneraOS objAux = (ElementGeneraOS)obj;
            name.setText(objAux.getTerminal());
            if(objAux.isSelected()){
                image.setImageDrawable(itemView.getResources().getDrawable(R.drawable.circulo_check_azul));
            }else{
                image.setImageDrawable(itemView.getResources().getDrawable(R.drawable.circulo_sombra));
            }


        }

    }


}
