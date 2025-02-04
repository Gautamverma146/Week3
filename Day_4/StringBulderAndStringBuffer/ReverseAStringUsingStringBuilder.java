public class ReverseAStringUsingStringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder str = new StringBuilder();

        // Appending a string to the StringBuilder
        str.append("HELLO");

        // Printing the original and reversed string
        System.out.println("Reversed of " + str + " is " + str.reverse());
    }
}
