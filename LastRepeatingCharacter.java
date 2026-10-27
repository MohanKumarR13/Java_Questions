public class LastRepeatingCharacter {
    public static void main(String[] args) {
        String s = "programming";
        char result = '\0';

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result = s.charAt(i);
                    break;
                }
            }

            if (result != '\0') {
                break;
            }
        }

        if (result != '\0') {
            System.out.println("Last repeating character: " + result);
        } else {
            System.out.println("No repeating character found");
        }
    }
}
