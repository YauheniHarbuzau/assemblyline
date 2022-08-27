package edu.itstep.assemblyline.service.impl;

import edu.itstep.assemblyline.model.GlassesTemples;
import edu.itstep.assemblyline.service.ILineStep;
import edu.itstep.assemblyline.service.IProductPart;

public class LineStepTemples implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new GlassesTemples();
    }
}