package com.apps.sam.mblocations.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SectorList {
    @SerializedName("data")
    private List<Sector> sectors;

    public List<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }
}
