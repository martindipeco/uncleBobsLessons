package objects_data_structure.data_abstraction;

public class PolarPointImpl implements AbstractPoint{
    private double r;
    private double theta;

    @Override
    public double getX() {
        return r * Math.cos(theta);
    }

    @Override
    public double getY() {
        return r * Math.sin(theta);
    }

    @Override
    public void setCartesian(double x, double y) {
        this.r = Math.sqrt(x * x + y * y);
        this.theta = Math.atan2(y, x);
    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public double getTheta() {
        return theta;
    }

    @Override
    public void setPolar(double r, double theta) {
        this.r = r;
        this.theta = theta;
    }
}
