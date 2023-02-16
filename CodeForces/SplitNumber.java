
import java.util.Scanner;

public class SplitNumber{
 public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
        byte num_of_textCases = scn.nextByte();
        long intput_number;
        int num_of_parts;
        while (num_of_textCases-- != 0) {
            intput_number = scn.nextLong();
            num_of_parts = scn.nextInt();
            
            while (num_of_parts != 0) {
                if (intput_number < num_of_parts) {
                    System.out.println(-1);
                    break;
                }
                long x = intput_number / num_of_parts;
                intput_number -= x;
                --num_of_parts;
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    }