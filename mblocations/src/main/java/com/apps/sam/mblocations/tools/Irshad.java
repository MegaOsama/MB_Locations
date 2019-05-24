package com.apps.sam.mblocations.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.widget.RecyclerView;

import com.apps.sam.mblocations.R;
import com.apps.sam.mblocations.services.OfficesServiceImpl;
import com.apps.sam.mblocations.services.SectorsServiceImpl;

public class Irshad {
    private String tag = Irshad.class.getName();
    private ProgressDialog progressDialog;
    private RecyclerView rvOffices;
    private RecyclerView rvSectors;
    private Activity context;

    public Irshad(Activity activity) {
        this.context = activity;
        progressDialog = new ProgressDialog(activity);
        rvOffices = activity.findViewById(R.id.rvOffices);
        rvSectors = activity.findViewById(R.id.rvSectors);
    }

    public void offices(int depart) {
        OfficesServiceImpl.all(context, depart, rvOffices, progressDialog);
    }

    public void sectors(int depart) {
        SectorsServiceImpl.all(context, depart, rvSectors, progressDialog);
    }

}
