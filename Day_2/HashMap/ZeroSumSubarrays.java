import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {

    // Method to find all zero-sum subarrays
    public static List<List<Integer>> findZeroSumSubarrays(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // HashMap to store (cumulative sum, list of indices)
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();

        int sum = 0;
        sumMap.put(0, new ArrayList<>()); // Initialize for subarray starting from index 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Calculate cumulative sum

            // If the sum is found in the map, it means we have a zero-sum subarray
            if (sumMap.containsKey(sum)) {
                List<Integer> startIndices = sumMap.get(sum);
                for (int start : startIndices) {
                    result.add(new ArrayList<>(List.of(start + 1, i)));
                }
            }

            // Add the current index to the list for this sum
            sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 1, 2, -1, 4, 2, -2};
        List<List<Integer>> zeroSumSubarrays = findZeroSumSubarrays(nums);

        System.out.println("Zero-sum subarrays (start, end indices): ");
        for (List<Integer> subarray : zeroSumSubarrays) {
            System.out.println(subarray);
        }
    }
}
