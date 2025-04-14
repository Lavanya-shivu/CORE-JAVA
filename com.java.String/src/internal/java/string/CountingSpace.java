package internal.java.string;

public class CountingSpace {
    public static void main(String args []){
        String sentence = "Learning Java in Xworkz";
        int spaceCount = 0;
        for(char ch : sentence.toCharArray()){
            if (ch == ' '){
                spaceCount++;
            }
        }
      System.out.println("Number of space is:" + spaceCount);
    }
}
