package edu.itstep.assemblyline;

import edu.itstep.assemblyline.model.GlassesCase;
import edu.itstep.assemblyline.model.GlassesLenses;
import edu.itstep.assemblyline.model.GlassesTemples;
import edu.itstep.assemblyline.service.IAssemblyLine;
import edu.itstep.assemblyline.service.impl.AssemblyLine;
import edu.itstep.assemblyline.service.impl.Product;

public class Main {

    public static void main(String[] args) {

        IAssemblyLine glasses = new AssemblyLine();
        glasses.assembleProduct(new Product(new GlassesCase(), new GlassesLenses(), new GlassesTemples()));
    }
}