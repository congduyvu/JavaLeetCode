package exercise_effort.day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] GetTwoSumOrder(int[] nums, int target){

        HashMap<Integer, Integer> mapNums = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];

            if (mapNums.containsKey(complement)){
                return new int[] { mapNums.get(complement), i};
            }
            mapNums.put(nums[i], i);
        }
        return new int[] {};
    }
}
