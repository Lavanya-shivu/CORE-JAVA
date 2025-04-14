package internal.java.string;

public class CharCount {
    public static void main(String args []){
        String sentence = "Learning Java in Xworkz";
        char targetChar = 'J';
        int count  = 0;
        for (char ch: sentence.toCharArray()){
        if(ch == targetChar){
            count++;
        }
        }
        System.out.println("Character occurs time is  "  + targetChar + ", " + count);
    }
}
