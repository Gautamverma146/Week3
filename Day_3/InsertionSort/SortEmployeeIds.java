public class SortEmployeeIds {
    //main method
    public static void main(String[] args) {
        //Unsorted given array
        int[] employeeID= {10,20,40,50,60,70};
        //calling insertion sorting method
        insertionSort(employeeID);
        //calling printing method to print sorted array
        printArray(employeeID);
    }
    // Mthod to sort array through insertion approach
    public static void insertionSort(int[] arr){
        for(int i=1; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j<=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    //display method
    public static void printArray(int[] arr){
        System.out.println("Array");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
