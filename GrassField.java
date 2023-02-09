import java.util.Scanner;
public class GrassField {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        while(testCases-- != 0){
            byte[][] fieldArray = new byte[2][2];
            for(byte i=0; i<2; i++){
                for(byte k=0; k<2; k++){
                    fieldArray[i][k]=scn.nextByte();
                }
            }
            byte ones = 0;
            for(byte i=0; i<2; i++){
                for(byte k=0; k<2; k++){
                    if(fieldArray[i][k] == 1){
                        ones++;
                    }
                }
            }
            if(ones==4) System.out.println(2);
            else if(ones>0) System.out.println(1);
            else System.out.println(0);
        }
    }
}