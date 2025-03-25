package objects_data_structure.data_object_antisymmetry.polymorphic_shape;

import objects_data_structure.data_object_antisymmetry.procedural_shape.Point;

public class Circle implements Shape{
    private Point center;
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }
}
