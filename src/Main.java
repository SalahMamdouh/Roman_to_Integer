import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //three cases from leetCode to test if it works or not
        String input = "III";
        //String input = "LVIII";
        //String input = "MCMXCIV";

        //print function to see all the results
        System.out.print(romanToInt(input));
    }

    //convert from roman to int function
    public static int romanToInt(String input) {
        Map <Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);

        int answer = 0;

        for (int i=0; i<input.length(); i++){
            if (i<input.length()-1 && (romanValues.get(input.charAt(i)) < romanValues.get(input.charAt(i+1)))){
                answer -= romanValues.get(input.charAt(i));
            }
            else{
                answer += romanValues.get(input.charAt(i));
            }
        }

        return answer;
    }
}