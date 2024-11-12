package com.hamitmizrak.thy_design_pattern._1_creation_a2_factory_method;

public class _4_RectangleFactory extends _3_ShapeFactory{

    @Override
    public _1_IShape createShapeFactory() {
        return new _2_Rectangle();
    }
}
