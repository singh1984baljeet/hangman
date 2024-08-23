public class StringShortHand {
    public static void main(String[] args) {
        String input = "aaaabbbbbcccc";
        String shorthand = convertToShorthand(input);
        System.out.println("Shorthand: " + shorthand);
    }

    public static String convertToShorthand(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder shorthand = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                shorthand.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        
        shorthand.append(str.charAt(str.length() - 1)).append(count);

        return shorthand.toString();
    }
}



