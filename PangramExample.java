public class PangramExample {
    public static void main(String[] args) {
        String s = "Hello world";
        boolean result = isPangram(s.toLowerCase());

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean isPangram(String s) {
        if (s.length() < 26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
