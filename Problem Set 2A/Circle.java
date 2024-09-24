/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2A (Cirlce)
 */

public class Circle {
    
    //instance variables
    double radius; 
    
    public Circle(){
        //default constructor
        radius = 1;
    }
    
    public Circle(double r) {
        radius = r;
    }
    
    //Behaviour methods
    public String toString() {
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double circumference() {
        return (2*(3.14159)*radius);
    }
    
    public double area() {
        return ((3.14159)*radius*radius);
    }
    }