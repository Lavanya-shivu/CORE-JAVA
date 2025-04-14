package internal.java.string;

public class WordFrequency {
    public static void main(String args[]) {
        String sentence = "Learning Java in Xworkz";
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            String wordCount = word + " ";
            int count = 0;
            for (String compareWord : words) {
                if (word.equals(compareWord)) {
                    count++;
                }
            }
            if (!result.contains(wordCount)) {
                result = result.concat(wordCount).concat(String.valueOf(count)).concat("\n");
            }
        }
        System.out.println(result);
    }
}