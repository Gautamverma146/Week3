public class FirstNegativeNumber {
//Main method
    public static void main(String[] args) {
//creating array containing negative number at index 4
        int[] array = {1,2,3,6,-3,2};
//calling method to linearly search negative number index
        int firstNegativeIndex = findFirstNegativeIndex(array);

        if (firstNegativeIndex != -1){
//displaying result
            System.out.println("First Negative Number index is: "+ firstNegativeIndex);
        }
        else {
            System.out.println("No Negative Number in the list");
        }
    }

     //Method for searching With Linear Search Approach
    private static int findFirstNegativeIndex(int[] arr) {
        // Use traditional for loop to access index and elements
        for(int i : arr){

            if(arr[i]<0){

                return i;
            }

        }
        return -1;
    }
}
