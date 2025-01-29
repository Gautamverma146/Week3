import java.util.Stack;

class QueueUsingStack {
    // Stack for enqueue operations
    private Stack<Integer> enqueStack;
    // Stack for dequeue operations
    private Stack<Integer> dequeueStack;

    // Constructor to initialize the stacks
    public QueueUsingStack() {
        enqueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    // Enqueue operation: Adds an element to the end of the queue
    public void enqueue(int value) {
        // Push the element onto the enqueStack
        enqueStack.push(value);
        System.out.println("Enqueued " + value);
    }

    // Dequeue operation: Removes an element from the front of the queue
    public int dequeue() {
        // If the dequeue stack is empty, transfer elements from the enqueue stack
        if (dequeueStack.isEmpty()) {
            // If both stacks are empty, the queue is empty
            if (enqueStack.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // Move all elements from enqueStack to dequeueStack to maintain FIFO order
            while (!enqueStack.isEmpty()) {
                dequeueStack.push(enqueStack.pop());
            }
        }
        // Pop the front element from dequeueStack
        return dequeueStack.pop();
    }

    // Peek operation: Returns the front element without removing it
    public int peek() {
        // If the dequeue stack is empty, transfer elements from the enqueue stack
        if (dequeueStack.isEmpty()) {
            // If both stacks are empty, the queue is empty
            if (enqueStack.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // Move all elements from enqueStack to dequeueStack to access the front element
            while (!enqueStack.isEmpty()) {
                dequeueStack.push(enqueStack.pop());
            }
        }
        // Return the front element
        return dequeueStack.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        // Queue is empty if both stacks are empty
        return enqueStack.isEmpty() && dequeueStack.isEmpty();
    }
}

class Main {
    public static void main(String[] args) {
        // Create a queue instance
        QueueUsingStack queue = new QueueUsingStack();

        // Perform enqueue operations
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        // Perform dequeue operation and display the dequeued element
        System.out.println("Dequeued: " + queue.dequeue());

        // Display the front element of the queue
        System.out.println("Front element: " + queue.peek());

        // Check if the queue is empty
        System.out.println("Queue is Empty: " + queue.isEmpty());
    }
}
