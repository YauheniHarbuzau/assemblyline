package edu.itstep.assemblyline.service;

public interface IProduct {

    void installFirstPart(IProductPart productPart);

    void installSecondPart(IProductPart productPart);

    void installThirdPart(IProductPart productPart);
}