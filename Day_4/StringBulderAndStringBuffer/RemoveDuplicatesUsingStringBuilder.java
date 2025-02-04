import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {
    public static void main(String[] args) {
        // Hardcoded string
        String str = "programming";

        // Remove duplicates and print result
        System.out.println("Original String: " + str);
        System.out.println("String without duplicates: " + removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        return result.toString();
    }
}
