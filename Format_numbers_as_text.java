
import java.util.Scanner;


public class Format_numbers_as_text {

/**
 * @Abdulrahman 
 */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        numToEng_0_999(in.nextInt());
        
        
    }
    
    public static void numToEng_0_999(int n) {// 0-999 

        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] hundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        String Res = "",
                ns = String.valueOf(n);
        int summa = 0;

        //onse
        if (n < 20) {
            Res = ones[n];
        }
        else if (n < 100) {
            Res = tens[Character.getNumericValue(ns.charAt(0))];
            if (Character.getNumericValue(ns.charAt(1)) != 0) {
                Res += "-" + ones[Character.getNumericValue(ns.charAt(1))];
            }

        }
        else if (n < 1000) {

            Res = hundreds[Character.getNumericValue(ns.charAt(0)) - 1];

            summa = Integer.parseInt(ns.substring(1));
            if (summa < 20 && summa != 0) {
                Res += " " + ones[summa];
            }
            else {

                if (Character.getNumericValue(ns.charAt(1)) != 0) {
                    Res += " " + tens[Character.getNumericValue(ns.charAt(1))];
                }

                if (Character.getNumericValue(ns.charAt(2)) != 0) {
                    Res += "-" + ones[Character.getNumericValue(ns.charAt(2))];
                }

            }
}
    System.out.println(Res);
}
    
}
