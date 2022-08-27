package edu.itstep.assemblyline.model;

import edu.itstep.assemblyline.model.parent.GlassesDetails;

public class GlassesLenses extends GlassesDetails {

    private final String name;

    public GlassesLenses() {
        this("Линзы");
    }

    public GlassesLenses(String name) {
        this.name = name;
    }
}