package com.apps.sam.mblocations.services;

import com.apps.sam.mblocations.Models.SectorList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SectorsService {
    @GET("api/sector/all")
    Call<SectorList> all();

    @GET("api/sector")
    Call<SectorList> departSectors(@Query("depart_id") Integer depart_id);
}
