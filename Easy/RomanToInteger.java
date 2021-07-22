import java.util.HashMap;
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IX";
        HashMap<String, Integer> roman_numeral = new HashMap<String, Integer>();
        int result = 0;
        roman_numeral.put("I", 1);
        roman_numeral.put("V", 5);
        roman_numeral.put("X", 10);
        roman_numeral.put("L", 50);
        roman_numeral.put("C", 100);
        roman_numeral.put("D", 500);
        roman_numeral.put("M", 1000);
        for(int i = 0; i < s.length(); i++) {
            if(i == s.length() - 1) {
                System.out.println("shit");
                result += roman_numeral.get(Character.toString(s.charAt(s.length() - 1)));
                break;
            }
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            int first_roman = roman_numeral.get(Character.toString(first));
            int second_roman = roman_numeral.get(Character.toString(second));
            //System.out.println(first);
            if(first_roman >= second_roman) {
                System.out.println("first " + first + " is greater than " + second);
                //System.out.println(first_roman);
                result += first_roman;
            } else {
                System.out.println("second " + second + " is greater than " + first);
                //System.out.println( second_roman - first_roman);
                result += second_roman - first_roman;
                i+=1;

            }
        }/*
        if(s.charAt(s.length() - 2) ==s.charAt(s.length() - 1)) {
            result += roman_numeral.get(Character.toString(s.charAt(s.length() - 1)));
        }*/
        System.out.println(result);

    }
}
