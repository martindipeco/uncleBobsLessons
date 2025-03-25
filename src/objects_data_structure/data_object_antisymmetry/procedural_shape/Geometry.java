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
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            return t.base * t.height / 2;
        }
        throw new NoSuchShapeException();
    }

    public double perimeter(Object shape) throws NoSuchShapeException {
        if(shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * 4;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width *2 + r.height*2;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.radius*2;
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            return t.side1 + t.side2 + t.side3;
        }
        throw new NoSuchShapeException();
    }
}
