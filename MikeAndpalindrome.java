

import java.util.Scanner;

public class MikeAndpalindrome{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = scn.next();
        byte c = 0;
        byte changes_no = 0;
        while (true) {

            if (text.charAt(c) != text.charAt(text.length() - 1 - c)) {
                changes_no++;
            }
            if (c == text.length() - 1) {
                break;
            }
            c++;
        }
        System.out.println(changes_no == 2 || (changes_no == 0 && (text.length() % 2 == 1)) ? "YES" : "NO");

    }
}
