package objects_data_structure.data_object_antisymmetry.procedural_shape;

public class Geometry {
    public final double PI = Math.PI;

    public double area(Object shape) throws NoSuchShapeException {
        if(shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * s.side;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.height * r.width;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.radius * c.radius;
        }
        throw new NoSuchShapeException();
    }
}
