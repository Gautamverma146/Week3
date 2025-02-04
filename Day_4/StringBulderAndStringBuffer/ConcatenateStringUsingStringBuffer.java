public class ConcatenateStringUsingStringBuffer {

    public static void main(String[] args) {
        // Declare and initialize the string array
        String[] str = {"hello", " how ", "are ", "you"};

        // Call the method to concatenate strings and print the result
        String result = concatenateString(str);
        System.out.println("Concatenated string is: " + result);
    }

    // Method to concatenate strings using StringBuffer
    public static String concatenateString(String[] words) {
        StringBuffer stringBuffer = new StringBuffer();

        // Iterate through each string in the array and append to StringBuffer
        for (String word : words) {
            stringBuffer.append(word); 
        }

        // Return the concatenated result
        return stringBuffer.toString();
    }
}
