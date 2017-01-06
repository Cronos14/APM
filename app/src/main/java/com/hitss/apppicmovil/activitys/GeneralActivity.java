package com.hitss.apppicmovil.activitys;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.hitss.apppicmovil.utils.Utils;

/**
 * Created by Tadeo-developer on 05/01/17.
 */

public class GeneralActivity extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            Utils.vibrate(getBaseContext());
            finish();
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Utils.vibrate(getBaseContext());
    }
}
