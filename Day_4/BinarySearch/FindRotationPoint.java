public class FindRotationPoint {

    public static void main(String[] args) {
        int[] rotatedArray = {18, 15, 2, 3, 6, 12};

        int rotationPoint = findRotationPoint(rotatedArray);

        System.out.println("Rotation point index is: " + rotationPoint);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element, search right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // else  search the left half
                right = mid;
            }
        }
        // `left` will point to the smallest element's index
        return left;
    }
}
