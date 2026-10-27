public class ReverseCharactersPreserveSpecialCharacters {
    public static void main(String[] args) {
        String s = "a,b$c";
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (!((a[i] >= 'a' && a[i] <= 'z') ||
                  (a[i] >= 'A' && a[i] <= 'Z') ||
                  (a[i] >= '0' && a[i] <= '9'))) {
                i++;
            } else if (!((a[j] >= 'a' && a[j] <= 'z') ||
                         (a[j] >= 'A' && a[j] <= 'Z') ||
                         (a[j] >= '0' && a[j] <= '9'))) {
                j--;
            } else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println("Original string: " + s);
        System.out.println("Reversed string: " + new String(a));
    }
}
