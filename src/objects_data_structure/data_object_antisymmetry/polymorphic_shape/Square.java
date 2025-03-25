package objects_data_structure.data_object_antisymmetry.polymorphic_shape;

import objects_data_structure.data_object_antisymmetry.procedural_shape.Point;

public class Square implements Shape{
    private Point topleft;
    private double side;

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }
}
