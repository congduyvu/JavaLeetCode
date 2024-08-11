package exercise_effort.day1;

public class Main {

    public static void main(String[] args) {

        //Exercise 1
        /*TwoSum sumOrders = new TwoSum();
        int[] nums1 = {2, 15, 11, 7};
        int target1 = 9;
        int[] result1 = sumOrders.GetTwoSumOrder(nums1, target1);
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");*/

        //Exercise 2
        /*PaLindrome paLindrome = new PaLindrome();
        System.out.println(paLindrome.CheckPalindromeNumber(28282));;*/

        //Exercise 3
        RomanNumber romanNumber = new RomanNumber();
        int result = romanNumber.convertToRomanNumber("XIV");
        System.out.println(result);
    }
}
