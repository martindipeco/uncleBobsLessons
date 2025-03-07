//Listing 6-2
//Abstract Point
//p. 94

package objects_data_structure.data_abstraction;

//in interfaces all methods are implicitly public
public interface AbstractPoint {
    double getX();
    double getY();
    void setCartesian(double x, double y);
    double getR();
    double getTheta();
    void setPolar(double r, double theta);
}
