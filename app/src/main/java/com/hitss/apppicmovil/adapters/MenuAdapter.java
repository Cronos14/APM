package com.hitss.apppicmovil.adapters;

import android.view.View;
import android.view.ViewGroup;

import com.hitss.apppicmovil.adapters.holders.MenuViewHolder;
import com.hitss.apppicmovil.adapters.holders.ViewHolder;

import java.util.ArrayList;

/**
 * Created by Tadeo-developer on 03/08/16.
 */
public class MenuAdapter<T> extends AdapterGeneral {
    public MenuAdapter(ArrayList objects, int layout) {
        super(objects, layout);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = getViewInflater(parent);

        ViewHolder viewHolder = new MenuViewHolder(itemView);
        itemView.setOnClickListener(this);
        return viewHolder;
    }

}
