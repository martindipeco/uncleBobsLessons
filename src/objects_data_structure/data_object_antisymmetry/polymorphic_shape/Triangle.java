package objects_data_structure.data_object_antisymmetry.polymorphic_shape;

public class Triangle implements Shape{
    private double height;
    private double base;
    private double side1;
    private double side2;
    private double side3;

    @Override
    public double area() {
        return base * height /2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
