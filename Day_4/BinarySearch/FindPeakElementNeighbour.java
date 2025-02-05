public class FindPeakElementNeighbour {
    //main  method
    public static void main(String[] args) {
        //initializing arrays
        int arr[] = {1, 2, 6, 5, 1, 6};
        int arr2[] = {2, 4, 6, 8, 5};
//calling method to find peak element
        System.out.println("Peak in arr1: " + findPeak(arr));
        System.out.println("Peak in arr2: " + findPeak(arr2));
    }
//method to find peak  element
    private static int findPeak(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || array[mid] > array[mid - 1]) && (mid == array.length - 1 || array[mid] > array[mid + 1])) {
                System.out.println("Peak Element in the Array is:");
                return array[mid];
            }

            // If left neighbor is greater, search left half
            if (mid > 0 && array[mid] < array[mid - 1]) {
                right = mid - 1;
                // Otherwise, search right half
            } else { // Otherwise, search right half
                left = mid + 1;
            }
        }
// No peak found (unreachable for valid input)
        return -1;
    }
}
