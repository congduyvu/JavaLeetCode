package exercise_effort.day1;

import java.util.HashMap;

public class RomanNumber {

    public String convertToRomanNumber(int number)
    {
        HashMap<Integer, String> numberMap = new HashMap<>();

        numberMap.put(1, "I");
        numberMap.put(5, "V");
        numberMap.put(10, "X");
        numberMap.put(50, "L");
        numberMap.put(100, "C");
        numberMap.put(500, "D");
        numberMap.put(1000, "M");

        return "";
    }
}
