package com.apps.sam.Irshad.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.widget.RecyclerView;

import com.apps.sam.Irshad.services.OfficesServiceImpl;
import com.apps.sam.Irshad.services.SectorsServiceImpl;

public class Irshad {
    private String tag = Irshad.class.getName();
    private ProgressDialog progressDialog;
    private RecyclerView rvOffices;
    private RecyclerView rvSectors;
    private Activity context;

    public Irshad(Activity activity) {
        this.context = activity;
        progressDialog = new ProgressDialog(activity);
        rvOffices = activity.findViewById(com.apps.sam.Irshad.R.id.rvOffices);
        rvSectors = activity.findViewById(com.apps.sam.Irshad.R.id.rvSectors);
    }

    public void offices(int depart) {
        OfficesServiceImpl.all(context, depart, rvOffices, progressDialog);
    }

    public void sectors(int depart) {
        SectorsServiceImpl.all(context, depart, rvSectors, progressDialog);
    }

}
