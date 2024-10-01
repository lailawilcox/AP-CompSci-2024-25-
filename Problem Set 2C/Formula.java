/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2C (Formula)
 */

class Formula {
    public static String Quadratic(double a1, double b, double c){
        double sqroot = Math.sqrt(b*b - 4*a1*c);
        double answer1 =  (-1*b + sqroot ) / (2*a1) ;
        double answer2 =  (-1*b - sqroot ) / (2*a1) ;
        return answer1 + " and " + answer2;
    }
    
    public static double Slope(double Sx1, double Sy1, double Sx2, double Sy2){
        double answer = (Sy2-Sy1) / (Sx2-Sx1);
        return answer;
    }
    
    public static String Midpoint(double Mx1, double My1, double Mx2, double My2){
        double answer1 = (Mx1+Mx2)/2.0;
        double answer2 = (My1+My2)/2.0;
        return "(" +answer1+ ", " +answer2+ ")";
    }
    
    public static double findArithmeticSeriesSum(double a, double d, int k){
        double answer = (k/2.0)*((2*a)+(d*(k-1)));
        return answer;
    }
    
    public static double findGeometricSeriesSum(double Ga, double r, int Gk) {
        double answerN = 1-Math.pow(r, (double)Gk);
        double answerD = 1-r;
        double answer = Ga*(answerN/answerD);
        return answer;
    }
    
    public static int rollDie (int sides){
        int min = 1;
        int answer = (int) (Math.random()*sides) + min;
        return answer;
    }
}