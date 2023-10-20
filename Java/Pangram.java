import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The given sentence is a pangram.");
        } else {
            System.out.println("The given sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sent) {
        boolean[] alphaPresent = new boolean[26];

        for (int i = 0; i < sent.length(); i++) {
            char c = sent.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphaPresent[c - 'a'] = true;
            }
        }

        for (boolean isPresent : alphaPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
