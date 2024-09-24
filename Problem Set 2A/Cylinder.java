
/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2A (Cylinder)
 */

public class Cylinder {
    
    //instance variables
    double height; 
    Circle base;
    
    public Cylinder(){
        //default constructor
        height = 1;
        base = new Circle(1);
    }
    
    public Cylinder(double h, double r) {
        height = h;
        base = new Circle(r);
    }
    
    //Behaviour methods
    public String toString() {
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and a height of " + height;
    }
    
    public double getRadius() {
        return  base.getRadius();
    }
    
       public double getHeight() {
        return height;
    }
    
    public double surfaceArea() {
        return (base.area()*2 + height*base.circumference());
    }
    
    public double volume() {
        return (base.area()*height);
    }
    }