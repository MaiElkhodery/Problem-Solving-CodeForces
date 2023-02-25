import java.util.Scanner;

public class LongComparison{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int numOfTestCases = scn.nextInt();
        int firstNum, numOfZeros1, secNum, numOfZeros2;
        char answer;
        while (numOfTestCases > 0) {
            firstNum = scn.nextInt();
            numOfZeros1 = scn.nextInt();
            secNum = scn.nextInt();
            numOfZeros2 = scn.nextInt();
            int min = Math.min(numOfZeros1, numOfZeros2);
            numOfZeros1 -= min;
            numOfZeros2 -= min;
          
                if (numOfZeros1 > 0) {
                    firstNum *= Math.pow(10, numOfZeros1);
                }
                if (numOfZeros2 > 0) {
                    secNum*=Math.pow(10, numOfZeros2);
                }
             
            if (firstNum > secNum) {
                answer = '>';
            } else if (firstNum == secNum) {
                answer = '=';
            } else {
                answer = '<';
            }
            System.out.println(answer);
            numOfTestCases--;
        }
    }
}