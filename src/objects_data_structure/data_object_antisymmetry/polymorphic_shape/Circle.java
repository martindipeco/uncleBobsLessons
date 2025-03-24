package objects_data_structure.data_object_antisymmetry.polymorphic_shape;

import objects_data_structure.data_object_antisymmetry.procedural_shape.Point;

public class Circle implements Shape{
    public Point center;
    public double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
