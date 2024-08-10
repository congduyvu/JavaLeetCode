package exercise_effort.day1;

public class PaLindrome {

    public boolean CheckPalindromeNumber(int x)
    {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int reversedNumber = 0;
        int originalNumber = x;
        while (x > 0){
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x = x / 10;
        }

        return reversedNumber == originalNumber;
    }
}
