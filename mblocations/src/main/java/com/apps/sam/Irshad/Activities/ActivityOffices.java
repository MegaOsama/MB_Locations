package com.apps.sam.Irshad.Activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.apps.sam.Irshad.R;
import com.apps.sam.Irshad.services.OfficesServiceImpl;

import java.util.Objects;

import timber.log.Timber;

public class ActivityOffices extends AppCompatActivity {
    String tag = ActivityOffices.class.getName();
    ProgressDialog progressDialog;
    RecyclerView rvOffices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offices);
        Toolbar toolbar = findViewById(R.id.toolbar);
        progressDialog = new ProgressDialog(ActivityOffices.this);
        rvOffices = findViewById(R.id.rvOffices);

        setSupportActionBar(toolbar);
        Bundle extras = getIntent().getExtras();

        if (!Objects.requireNonNull(extras).isEmpty()) {
            int sector = extras.getInt("sector", 0);
            Timber.d(tag, "sector_id : " + sector);
            offices(sector);
        }
    }

    private void offices(int depart) {
        OfficesServiceImpl.all(this, depart, rvOffices, progressDialog);
    }


}
