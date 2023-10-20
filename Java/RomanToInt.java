import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currVal = romanMap.get(s.charAt(i));
            if (currVal < prevVal) {
                result -= currVal;
            } else {
                result += currVal;
            }
            prevVal = currVal;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNum = scanner.nextLine().toUpperCase();

        int intVal = romanToInt(romanNum);
        System.out.println("Roman numeral " + romanNum + " is equivalent to integer " + intVal);
    }
}
