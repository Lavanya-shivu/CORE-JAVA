package internal.java.string;

public class ReplaceSpace {
    public static void main (String args []){
        String sentence = "Learning Java in Xworkz";
        String replacedSentence = sentence.replace(' ','%');
        System.out.println("Original:" + sentence);
        System.out.println("Modified:" + replacedSentence);

    }
}
