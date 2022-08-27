package edu.itstep.assemblyline.model;

import edu.itstep.assemblyline.model.parent.GlassesDetails;

public class GlassesTemples extends GlassesDetails {

    private final String name;

    public GlassesTemples() {
        this("Дужки");
    }

    public GlassesTemples(String name) {
        this.name = name;
    }
}