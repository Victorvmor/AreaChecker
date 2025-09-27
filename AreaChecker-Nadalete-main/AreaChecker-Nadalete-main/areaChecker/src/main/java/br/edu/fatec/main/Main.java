package br.edu.fatec.main;

import br.edu.fatec.factory.interfaces.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();


        Calculable square = factory.getShape(ShapeType.SQUARE, new Double[]{11.0});
        System.out.printf("Square area: %.2f %n", square.calcularArea());


        Calculable rectangle = factory.getShape(ShapeType.RECTANGLE, new Double[]{7.0, 3.0});
        System.out.printf("Rectangle area: %.2f %n", rectangle.calcularArea());


        Calculable circle = factory.getShape(ShapeType.CIRCLE, new Double[]{5.0});
        System.out.printf("Circle area: %.2f %n", circle.calcularArea());


        Calculable triangle = factory.getShape(ShapeType.TRIANGLE, new Double[]{5.0, 10.0});
        System.out.printf("Triangle area: %.2f %n", triangle.calcularArea());


        Calculable parallelogram = factory.getShape(ShapeType.PARALLELOGRAM, new Double[]{2.5, 3.7});
        System.out.printf("Parallelogram area: %.2f %n", parallelogram.calcularArea());


        Calculable trapezo = factory.getShape(ShapeType.TRAPEZO, new Double[]{10.0, 3.0, 6.0});
        System.out.printf("Trapezo area: %.2f %n", trapezo.calcularArea());


        Calculable hexagon = factory.getShape(ShapeType.HEXAGON, new Double[]{8.9});
        System.out.printf("Hexagon area: %.2f %n", hexagon.calcularArea());


        Calculable diamond = factory.getShape(ShapeType.DIAMOND, new Double[]{15.0, 9.57});
        System.out.printf("Diamond area: %.2f %n", diamond.calcularArea());


        Calculable cube = factory.getShape(ShapeType.CUBE, new Double[]{3.5});
        System.out.printf("Cube area: %.2f %n", cube.calcularArea());
    }
}