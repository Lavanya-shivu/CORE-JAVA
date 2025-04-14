public class Runner {
    public static void main(String[] args) {
        String original = "Bengaluru";
        char[] chars = original.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(original.charAt(i)));
        }
        System.out.println("Reversed: " + reversed);
    }
    }

