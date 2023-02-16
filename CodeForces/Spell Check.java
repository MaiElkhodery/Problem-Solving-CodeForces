import java.util.Scanner;
import java.util.ArrayList;

public class spell_check {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        while(testCases-- != 0){
            int length = scn.nextInt();
            String name = scn.next();
            System.out.println(name.contains("T")&&name.contains("i")&&name.contains("m")&&name.contains("u")&&name.contains("r")&&length==5?"YES":"NO");
        }
    }
}