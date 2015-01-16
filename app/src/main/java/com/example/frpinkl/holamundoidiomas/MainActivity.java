package com.example.frpinkl.holamundoidiomas;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
//---HORIZONTAL mode---
            Toast.makeText(getApplicationContext(), "HORIZONTAL", Toast.LENGTH_SHORT).show();
        } else {
//---VERTICAL mode---
            Toast.makeText(getApplicationContext(), "VERTICAL", Toast.LENGTH_SHORT).show();        }

        ImageView image  = (ImageView) findViewById(R.id.imageView);
        Resources res = getResources(); /** from an Activity */
        image.setImageDrawable(res.getDrawable(R.drawable.face));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
