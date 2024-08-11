package exercise_effort.day1;

import java.util.HashMap;

public class RomanNumber {

    public int convertToRomanNumber(String number)
    {
        HashMap<Character, Integer> numberMap = new HashMap<>();

        numberMap.put('I', 1);
        numberMap.put('V', 5);
        numberMap.put('X', 10);
        numberMap.put('L', 50);
        numberMap.put('C', 100);
        numberMap.put('D', 500);
        numberMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for(int i = number.length()-1; i >= 0; i--){
            char c = number.charAt(i);
            int currentValue = numberMap.get(c);
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}
