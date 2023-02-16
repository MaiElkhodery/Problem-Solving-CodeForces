import java.util.Scanner;
public class DecodeAlgorithm {

    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        while(testCases-- != 0){
            int length = scn.nextInt();
            String encodedString = scn.next();
            char[] lettersArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            int index=length-1;
            String decodedString="";
            while(index >-1){
                if(encodedString.charAt(index) == '0'){
                    decodedString=lettersArray[(Integer.parseInt(encodedString.substring(index-2,index)))-1]+decodedString;
                    index-=3;
                    continue;
                }
                else{
                    decodedString=lettersArray[(Integer.parseInt(encodedString.charAt(index)+""))-1]+decodedString;
                }
                index--;
            }
            System.out.println(decodedString);
        }
    }
}