package internal.java.string;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class WordCheck {
    public static void main(String args []){
        String sentence = "Learning Java in Xworkz";
        String targetWord = "Java";
        if (sentence.contains(targetWord)) {
            System.out.println("Target word is present");
        }
        else {
            System.out.println("Target word is not present");
        }
    }

}
