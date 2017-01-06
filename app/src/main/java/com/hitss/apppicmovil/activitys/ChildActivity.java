package com.hitss.apppicmovil.activitys;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import com.hitss.apppicmovil.R;
import com.hitss.apppicmovil.utils.Utils;

/**
 * Created by Tadeo-developer on 05/01/17.
 */

public class ChildActivity extends GeneralActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            Utils.vibrate(getBaseContext());
            finish();
        }else if(item.getItemId()== R.id.option_home){
            Utils.vibrate(getBaseContext());
            Intent intent = new Intent(ChildActivity.this,HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);

    }

}
