package edu.itstep.assemblyline.service.impl;

import edu.itstep.assemblyline.model.GlassesLenses;
import edu.itstep.assemblyline.service.ILineStep;
import edu.itstep.assemblyline.service.IProductPart;

public class LineStepLenses implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new GlassesLenses();
    }
}