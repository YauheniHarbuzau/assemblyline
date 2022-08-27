package edu.itstep.assemblyline.service.impl;

import edu.itstep.assemblyline.model.GlassesCase;
import edu.itstep.assemblyline.service.ILineStep;
import edu.itstep.assemblyline.service.IProductPart;

public class LineStepCase implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new GlassesCase();
    }
}