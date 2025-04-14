package internal.java.string;

public class Palindrome {
    public static void main(String args []){
        String sentence = "Xworkz";
        String reversed = "";
        char [] chars = sentence.toCharArray();
        for (char ch : chars){
            reversed = reversed.concat(String.valueOf(ch));
        }
        if(sentence.equals(reversed)){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
