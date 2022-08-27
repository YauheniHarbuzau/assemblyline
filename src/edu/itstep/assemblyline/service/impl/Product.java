package edu.itstep.assemblyline.service.impl;

import edu.itstep.assemblyline.service.IProduct;
import edu.itstep.assemblyline.service.IProductPart;

public class Product implements IProduct {

    IProductPart glassesCase;
    IProductPart glassesLenses;
    IProductPart glassesTemples;

    public Product(IProductPart glassesCase, IProductPart glassesLenses, IProductPart glassesTemples) {
        this.glassesCase = glassesCase;
        this.glassesLenses = glassesLenses;
        this.glassesTemples = glassesTemples;
    }

    @Override
    public void installFirstPart(IProductPart glassesCase) {
        System.out.println("Установка корпуса очков");
    }

    @Override
    public void installSecondPart(IProductPart glassesLenses) {
        System.out.println("Установка линз очков");
    }

    @Override
    public void installThirdPart(IProductPart glassesTemples) {
        System.out.println("Установка дужек очков");
    }
}