public class CircularTour {
    //Function to find the starting point of the circular tour
    public static int findStartingPump(int[] petrol, int[] distance){
        int n = petrol.length;
        //Start index for the tour
        int start = 0;
        //track overall petrol surplus
        int totalSurplus =0;
        //track current petrol during traversal
        int currentSurplus = 0;
        for (int i=0; i<n; i++){
            totalSurplus += petrol[i] - distance[i];
            currentSurplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset  the start point
            if(currentSurplus<0){
                //Move to the next pump
                start = i + 1;
                currentSurplus = 0;
            }
        }
        //If total surplus is negative, no soln exists
        return totalSurplus >= 0 ? start : -1;
    }
    //Main method
    public static void main(String[] args) {
         int[] petrol = {4,6,7,4};
         int[] distance= {6,5,3,5};
         int startPump = findStartingPump(petrol, distance);
         if(startPump != -1){
             System.out.println(" start at petrol pump index: "+ startPump);
         }
         else {
             System.out.println("No solution exists");
         }

    }
}
