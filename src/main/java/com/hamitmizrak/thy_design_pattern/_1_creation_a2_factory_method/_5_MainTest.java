package com.hamitmizrak.thy_design_pattern._1_creation_a2_factory_method;

public class _5_MainTest {

    // PSVM
    public static void main(String[] args) {
        // Dikdörtgen üretici sınıfımızdan dikdörtgen oluşturalım
        _3_ShapeFactory rectangleFactory = new _4_RectangleFactory();
        _1_IShape rectangle = rectangleFactory.createShapeFactory();
        rectangle.draw();

        // Daire üretici sınıfımızdan daire oluşturalım
        _3_ShapeFactory circleFactory = new _4_CircleFactory();
        _1_IShape circle = circleFactory.createShapeFactory();
        circle.draw();

    } //end psvm
} // end _5_MainTest
