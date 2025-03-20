package objects_data_structure.data_abstraction;

public class CartesianPointImpl implements AbstractPoint{
    private double x;
    private double y;

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setCartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getR() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double getTheta() {
        return Math.atan2(y, x);
    }

    @Override
    public void setPolar(double r, double theta) {
        this.x = r * Math.cos(theta);
        this.y = r * Math.sin(theta);
    }
}
