package edu.itstep.assemblyline.model;

import edu.itstep.assemblyline.model.parent.GlassesDetails;

public class GlassesCase extends GlassesDetails {

    private final String name;

    public GlassesCase() {
        this("Корпус");
    }

    public GlassesCase(String name) {
        this.name = name;
    }
}