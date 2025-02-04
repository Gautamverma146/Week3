public class CompareStringBufferWithStringBuilder {

    public static void main(String[] args) {
        // Initialize the string array
        String[] str = {"hello", "how", "are", "you"};

        // Compare StringBuffer and StringBuilder concatenation
        String resultUsingStringBuffer = concatenateUsingStringBuffer(str);
        String resultUsingStringBuilder = concatenateUsingStringBuilder(str);

        // Print results
        System.out.println("Concatenated String using StringBuffer: " + resultUsingStringBuffer);
        System.out.println("Concatenated String using StringBuilder: " + resultUsingStringBuilder);
    }

    // Concatenates strings using StringBuilder
    private static String concatenateUsingStringBuilder(String[] strings) {
        long startTime, endTime;
        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : strings) {
            // Append word with a space
            stringBuilder.append(word).append(" ");
        }
        // .trim() function Remove extra space
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
        return stringBuilder.toString().trim();

    }

    // Concatenates strings using StringBuffer
    private static String concatenateUsingStringBuffer(String[] strings) {
        long startTime, endTime;
        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (String word : strings) {
            stringBuffer.append(word).append(" ");
        }
        // .trim() Remove extra space
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
        return stringBuffer.toString().trim();
    }
}
