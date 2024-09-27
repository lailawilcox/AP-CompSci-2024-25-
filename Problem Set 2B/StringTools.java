/**
 * AP Computer Science
 * Laila Wilcox
 * September 9th, 2024
 * Promblem Set 2B (StringTools)
 */

public class StringTools {
    public String lastLetter(String str){
        int length = str.length();
        return str.substring(length-1);
    }

    public String formatPhoneNumber(String str){
        return "(" + str.substring(0,3) + ") " + str.substring(3,6) + "-" + str.substring(6,10);
    }

    public String middleThree(String str){
        int length = str.length();
        int middle = length/2;
        return str.substring(middle-1,middle+2);
    }

    public String swapLastTwo(String str){
        int length = str.length();
        return str.substring(0,length-2) + str.substring(length-1) + str.substring(length-2, length-1);
    }

    public boolean frontAgain (String str, int n){
        int length = str.length();

        String startLetters = str.substring(0, n);
        String endLetters = str.substring(length-n, length);

        return startLetters.equals(endLetters);
    }

    public String frontAgain2 (String str, int n){
        int length = str.length();

        String startLetters = str.substring(0, n);
        String endLetters = str.substring(length-n, length);
        
        return ("(" + startLetters + "-" + endLetters +")");
    }
}