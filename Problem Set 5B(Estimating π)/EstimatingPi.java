
public class EstimatingPi{
    public static void main (String[] args) { 

        Fraction MILU = new Fraction(355, 113);

        final double EPSILSON = Math.abs(Math.PI - MILU.toDouble());

        Fraction bestFraction = MILU;
        double bestDifference = EPSILSON;

        int numerator = MILU.getNumerator();
        int denominator = MILU.getDenominator();
        int count = 0;

        while(count < 1000000000){
            Fraction currentFraction = new Fraction(numerator, denominator);
            double currentDifference = Math.abs(Math.PI - currentFraction.toDouble());
            
            if(currentDifference < bestDifference){
                bestFraction = currentFraction;
                bestDifference = currentDifference;
            }
            
            if(currentFraction.toDouble() < Math.PI){
                numerator++;
            } else {
                denominator++;
            }
            
            count++;
        }
        
        System.out.println("The fraction closest to PI is: " + bestFraction);
        System.out.println("The number is: " + bestFraction.toDouble());
        System.out.println("The difference from PI is: " + bestDifference);

    }
}
