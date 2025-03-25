package objects_data_structure.data_object_antisymmetry.polymorphic_shape;

import objects_data_structure.data_object_antisymmetry.procedural_shape.Point;

public class Rectangle implements Shape{
    private Point topLeft;
    private double height;
    private double width;

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return height*2 + width*2;
    }
}
