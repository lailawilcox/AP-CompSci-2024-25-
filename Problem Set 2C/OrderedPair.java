/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2C (OrderedPair)
 */

class OrderedPair {
    
    double x, y;
    
    public OrderedPair (double X, double Y) {
        x = X;
        y = Y;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}
