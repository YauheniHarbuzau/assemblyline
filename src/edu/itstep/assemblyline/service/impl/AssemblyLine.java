package edu.itstep.assemblyline.service.impl;

import edu.itstep.assemblyline.model.GlassesCase;
import edu.itstep.assemblyline.model.GlassesLenses;
import edu.itstep.assemblyline.model.GlassesTemples;
import edu.itstep.assemblyline.service.IAssemblyLine;
import edu.itstep.assemblyline.service.IProduct;

public class AssemblyLine implements IAssemblyLine {

    @Override
    public IProduct assembleProduct(IProduct product) {

        GlassesCase glassesCase = (GlassesCase) new LineStepCase().buildProductPart();
        product.installFirstPart(glassesCase);

        GlassesLenses glassesLenses = (GlassesLenses) new LineStepLenses().buildProductPart();
        product.installSecondPart(glassesLenses);

        GlassesTemples glassesTemples = (GlassesTemples) new LineStepTemples().buildProductPart();
        product.installThirdPart(glassesTemples);

        Product glasses = new Product(glassesCase, glassesLenses, glassesTemples);
        System.out.println("---");
        System.out.println("Очки собраны");

        return glasses;
    }
}