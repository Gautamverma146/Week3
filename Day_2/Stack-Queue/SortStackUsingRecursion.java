import java.util.Stack;

public class SortStackUsingRecursion {
    //Function to sort the Stack using recursion
    public static void sortStack(Stack<Integer> stack){
        //base case : return i stack is empty
        if(!stack.isEmpty()){
            // pop the top element
            int top = stack.pop();
            //recursively sort the remaining stack
            sortStack(stack);
            //Insert the popped element at the correct position
           insertAtCorrectPosition(stack,top);

        }
    }
    //Helper function to insert an element in sorted stack
    private static void insertAtCorrectPosition(Stack<Integer> stack,int value){
        //Base case: If stack is empty or value is greater than the element
        if(stack.isEmpty() || value >= stack.peek()){
            stack.push(value);
            return;
        }
        //remove the top element and call recursively
        int top =stack.pop();

        insertAtCorrectPosition(stack,value);
        //put the removed element back
        stack.push(top);

    }
    //Utility function to print the element of the stack
    public static void printStack(Stack<Integer> stack){
        for(int num : stack){
            System.out.println(num+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        System.out.println("original Stack");
        printStack(stack);
//sort the stack
        sortStack(stack);
        System.out.println("sorted stack");
        printStack(stack);
    }
}

