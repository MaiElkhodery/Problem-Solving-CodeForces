import java.util.Scanner;

public class  DifferentDifferences{

public static void main(String[] args){

 Scanner scn = new Scanner(System.in);
        short num_of_testCases = scn.nextShort();
        while (num_of_testCases-- > 0) {
            short arrSize = scn.nextShort();
            short nMax = scn.nextShort();

            short counter = 1;
            short[] array = new short[arrSize--];
            array[arrSize--] = nMax;
            while (arrSize >= 0) {
                if (nMax - counter >= arrSize + 1) {
                    nMax -= counter;
                    array[arrSize] = nMax;
                    counter++;
                } else {
                    array[arrSize] = --nMax;
                }
                arrSize--;
            }
            short index = 0;
            while (index < array.length) {
                System.out.print(array[index++]+" ");
            }
            System.out.println();
        }
}
}