
public class Fraction{

    //instance variables
    private int numerator;
    private int denominator;

    //Constructors
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int num, int den){
        setNumerator(num);
        setDenominator(den);
    }

    public Fraction(String fraction){
        setNumerator(Integer.parseInt(fraction.substring(0,fraction.indexOf("/"))));
        setDenominator(Integer.parseInt(fraction.substring(fraction.indexOf("/")+1)));
    }

    public Fraction(Fraction f){
        numerator = f.numerator;
        denominator = f.denominator;
    }

    //Accessor Methods
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public double toDouble(){
        return (double)numerator/denominator;
    }

    //Helper Methods
    public int GCF(int a, int b){
        while(a != b){
            if (b < a){
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    //Mutator Methods
    public void setNumerator(int num){
        numerator = num;
    }

    public void setDenominator(int denom){
        if(denom != 0){
            denominator = denom;
        }else{
            System.out.println("Error: Denominator cannot be zero");
        }
    }

    public void reduce(){
        numerator = numerator/GCF(numerator, denominator);
        denominator = denominator/GCF(numerator, denominator);
    }

    //Static Methods
    public static Fraction multiply(Fraction a, Fraction b){
        Fraction answer = new Fraction((a.getNumerator())*(b.getNumerator()), (a.getDenominator())*(b.getDenominator()));
        
        answer.reduce();
       
        return answer;
    }

    public static Fraction divide(Fraction a, Fraction b){
        Fraction answer = new Fraction((a.getNumerator())*(b.getDenominator()), (a.getDenominator())*(b.getNumerator()));
        
        answer.reduce();
        
        return answer;
    }

    public static Fraction add(Fraction a, Fraction b){
        Fraction answer = new Fraction();
        
        int aNum = a.getNumerator();
        int aDenom = a.getDenominator();
        
        int bNum = b.getNumerator();
        int bDenom = b.getDenominator();
        
        answer.setNumerator((aNum*bDenom)+(bNum*aDenom));
        answer.setDenominator(aDenom*bDenom);
        
        answer.reduce();

        return answer;
    }
    
    public static Fraction subtract(Fraction a, Fraction b){
        Fraction answer = new Fraction();
        
        int aNum = a.getNumerator();
        int aDenom = a.getDenominator();
        
        int bNum = b.getNumerator();
        int bDenom = b.getDenominator();
        
        answer.setNumerator((aNum*bDenom)-(bNum*aDenom));
        answer.setDenominator(aDenom*bDenom);
        
        answer.reduce();

        return answer;
    }

}

