package LT001;
import java.util.HashMap;
import java.util.Map;
public class LT005 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int x = nums[i];
            int y = target - x;
            if (d.containsKey(y)) {
                return new int[] {d.get(y), i};
            }
            d.put(x, i);
        }
        return new int[] {}; // In case no solution is found
    }

    public static void main(String[] args) {
        LT005 solution = new LT005();

        // Test case: Example from the problem statement
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}


