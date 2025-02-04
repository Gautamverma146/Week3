public class SearchForSpecificWord {
    //Main method
    public static void main(String[] args) {
        //creating paragraph
        String[] senteces = {"My name is Gautam verma", "I am persuing B.tech", "My domain language is java"};
      // Setting Target word
        String targetWord = "Gautam";
//Calling method to find Sentence with specific target word which is "Guatam"
        String result = findSentenceWithSpecificWord(senteces, targetWord);
        //displaying result
        System.out.println(result);
    }
//Method to find Sentence wtih target word "
    private static String findSentenceWithSpecificWord(String[] sentences, String targetWord) {
        for(String str : sentences){
            if(str.contains(targetWord)){
                return str;
            }
        }
        //return not found if target word not found
        return "not found";
    }
}
