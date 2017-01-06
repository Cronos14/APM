package com.hitss.apppicmovil.adapters.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.models.ElementMenu;
import com.hitss.apppicmovil.utils.typographys.FactoryOpenSans;
import com.hitss.apppicmovil.utils.typographys.OpenSans;

/**
 * Created by Tadeo Gonzalez on 03/01/2017.
 */

public class MenuViewHolder extends ViewHolder {

    private ImageView image;
    private TextView name;
    private FactoryOpenSans factoryOpenSans;

    public MenuViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.imgApp);
        name = (TextView)itemView.findViewById(R.id.txtApp);
        factoryOpenSans = FactoryOpenSans.getInstance(itemView.getContext().getAssets());
        name.setTypeface(factoryOpenSans.getTypeface(OpenSans.SEMI_BOLD));
        name.setTextColor(itemView.getResources().getColor(R.color.negro_custom));
    }

    @Override
    public void bind(Object obj) {

        if(obj instanceof ElementMenu){
            ElementMenu objAux = (ElementMenu)obj;
            image.setImageBitmap(objAux.getIcono());
            name.setText(objAux.getNombre());
        }

    }

}
