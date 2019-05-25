package com.apps.sam.mbLocations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.apps.sam.Irshad.tools.Irshad;


public class MainActivity extends AppCompatActivity {

    String tag = MainActivity.class.getName();
    Irshad irshad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        irshad = new Irshad(this);
        try {

            irshad.sectors(2);

        } catch (Exception ex) {
            Toast.makeText(MainActivity.this, "something gone ", Toast.LENGTH_LONG).show();
            Log.d(tag, ex.getMessage());
            ex.printStackTrace();
        }

    }
}
