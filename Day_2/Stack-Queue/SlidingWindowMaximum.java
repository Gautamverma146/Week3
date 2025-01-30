import java.util.PriorityQueue;
import java.util.Comparator;
public class SlidingWindowMaximum {
    //Function to find the maximum of each sliding wondow
    public static int[] maxSlidingWindow(int[] nums, int k){
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];
        //Max heap using a priority queue with custom comparator
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                //compare by element valuye is descending order
                (a,b) -> b[0] - a[0]
        );
        for( int i =0; i < n; i++){
            //Add the current element along with its index to the heap
            maxHeap.offer( new int[]{nums[i],i});

            //remove element from heap thatare outside the current window
            while(maxHeap.peek() [1] <=  i-k){
                maxHeap.poll();
            }

            //store the maximum when the window is valid
            if(i>=k -1){
                result[i-k+1] = maxHeap.peek()[0];
            }
        }
        return result;
    }

    //Main function
    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
         int[] result = maxSlidingWindow(nums,k);
        System.out.println("Sliding Window Maximums: ");
        for( int max : result){
            System.out.println(max+ " ");
        }

    }

}
