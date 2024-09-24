/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2A (Driver)
 */

public class Driver {
    public static void main (String[] args) {
        //instantiation of Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        
        System.out.println("Creating a circle with the default constructor!");
        System.out.println(c1);
        System.out.println("getRadius() --> " + c1.getRadius() + " units");
        System.out.println("circumference() --> " + c1.circumference() + " units");
        System.out.println("area() --> " + c1.area() + " units^2");
        System.out.println("");
        
        System.out.println("Creating a circle with a parameterized constructor!");
        System.out.println(c2);
        System.out.println("getRadius() --> " + c2.getRadius() + " units");
        System.out.println("circumference() --> " + c2.circumference() + " units");
        System.out.println("area() --> " + c2.area() + " units^2");
        System.out.println("");
        
        //instantiation of Cylinder
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(5, 5);
        
        System.out.println("Creating a cylinder with the default constructor!");
        System.out.println(cy1);
        System.out.println("getRadius() --> " + cy1.getRadius() + " units");
        System.out.println("getHeight() --> " + cy1.getHeight() + " units");
        System.out.println("surfaceArea() --> " + cy1.surfaceArea() + " units");
        System.out.println("volume() --> " + cy1.volume() + " units^3");
        System.out.println("");
        
        System.out.println("Creating a cylinder with the default constructor!");
        System.out.println(cy2);
        System.out.println("getRadius() --> " + cy2.getRadius() + " units");
        System.out.println("getHeight() --> " + cy2.getHeight() + " units");
        System.out.println("surfaceArea() --> " + cy2.surfaceArea() + " units");
        System.out.println("volume() --> " + cy2.volume() + " units^3");
        System.out.println("");
        
    }
}


