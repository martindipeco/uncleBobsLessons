package objects_data_structure.data_object_antisymmetry.polymorphic_shape;

import objects_data_structure.data_object_antisymmetry.procedural_shape.Point;

public class Rectangle implements Shape{
    public Point topLeft;
    public double height;
    public double width;

    @Override
    public double area() {
        return height * width;
    }
}
