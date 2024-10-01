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
    
    public static double Slope(OrderedPair A, OrderedPair B){
        double answer = (B.y-A.y) / (B.x-A.x);
        return answer;
    }
    
    public static OrderedPair Midpoint(OrderedPair A, OrderedPair B){
        double answer1 = (A.x + B.x)/2.0;
        double answer2 = (A.y + B.y)/2.0;
        OrderedPair answer = new OrderedPair(answer1, answer2);
        return answer;
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