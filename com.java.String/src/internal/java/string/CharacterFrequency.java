package internal.java.string;

public class CharacterFrequency {
    public static void  main(String args []){
        String sentence = "Learning Java in Xworkz";
        char[] chars = sentence.toCharArray();
        String result = "";
        for(char currentChar : chars){
            if(currentChar == ' '){
                continue;
            }
            int count = 0;
            for(char c: chars){
                if(c == currentChar){
                    count++;
                }
            }
            result = result.concat(currentChar + " : " + count + "\n");
        }
        System.out.println(result);
    }
}
