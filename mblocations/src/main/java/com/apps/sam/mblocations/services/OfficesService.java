package com.apps.sam.mblocations.services;

import com.apps.sam.mblocations.Models.Offices;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OfficesService {
    @GET("api/office")
    Call<Offices> all(@Query("sector_id") Integer sector_id);
}
