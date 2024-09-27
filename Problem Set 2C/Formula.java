/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2C (Formula)
 */

class Formula {
    public static String Quadratic(double a, double b, double c){
        double sqroot = Math.sqrt(b*b - 4*a*c);
        double answer1 =  (-1*b + sqroot ) / (2*a) ;
        double answer2 =  (-1*b - sqroot ) / (2*a) ;
        return answer1 + " and " + answer2;
    }
    
    public static double Slope(double x1, double y1, double x2, double y2){
        double answer = (y2-y1) / (x2-x1);
        return answer;
    }
}