import java.util.Stack;

public class StockSpan {
    // Function to calculate stock span
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];  // Array to store the span values

        // Stack to store indices of days
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop from stack while the current price is greater than or equal to the price at the top index
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If the stack is empty, it means the current price is greater than all previous prices
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push the current index onto the stack
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};  // Stock prices
        int[] span = calculateSpan(prices);           // Calculate stock spans

        System.out.println("Stock prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\nStock spans:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
