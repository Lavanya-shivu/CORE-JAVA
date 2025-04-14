package internal.java.string;

public class WordCount {
        public void main(String[] args) {
            String sentence = "Learning java in Xworkz";

            int wordCount = 1;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            System.out.println("Word count:" +wordCount);
        }
    }



