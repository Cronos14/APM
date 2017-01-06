package com.hitss.apppicmovil.adapters.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.models.ElementTabMenu;
import com.hitss.apppicmovil.utils.typographys.FactoryOpenSans;
import com.hitss.apppicmovil.utils.typographys.OpenSans;

/**
 * Created by Tadeo Gonzalez on 03/01/2017.
 */

public class TabMenuViewHolder extends ViewHolder {

    private ImageView image;
    private TextView name;
    private FactoryOpenSans factoryOpenSans;

    public TabMenuViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.imageView_element);
        name = (TextView)itemView.findViewById(R.id.textView_element);
        factoryOpenSans = FactoryOpenSans.getInstance(itemView.getContext().getAssets());


    }

    @Override
    public void bind(Object obj) {

        if(obj instanceof ElementTabMenu){
            ElementTabMenu objAux = (ElementTabMenu)obj;
            image.setImageBitmap(objAux.getIconActive());
            image.setBackgroundDrawable(objAux.getFondo());
            name.setText(objAux.getNombre());

            if(objAux.isSelected()){
                name.setTypeface(factoryOpenSans.getTypeface(OpenSans.BOLD));
                image.setImageBitmap(objAux.getIconActive());

            }else{
                name.setTypeface(factoryOpenSans.getTypeface(OpenSans.REGULAR));
                image.setImageBitmap(objAux.getIconInactive());
            }

        }

    }

}
