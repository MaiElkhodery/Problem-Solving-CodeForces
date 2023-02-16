import java.util.Scanner;
public class Robots {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        while(testCases-- != 0){
            int row = scn.nextInt();
            int column = scn.nextInt();
            char[][] robotsArray = new char[row][column];
            String buffer;
            for(int r =0; r<row; r++){
                buffer = scn.next();
                for(int c=0; c<column; c++){
                    robotsArray[r][c] = buffer.charAt(c);
                }
            }
    
            String done = "NO";
            boolean doMoveLeft = true ;
            boolean doMoveUp= true ;
            while(true){
                if(robotsArray[0][0] == 'R'){
                    done = "YES";
                    break;
                }
                else{
                    for(int r=0; r<row; r++){
                        for(int c=0; c<column; c++){
                            if(robotsArray[r][c] == 'R' && c == 0){
                                doMoveLeft=false;
                            }
                            if(robotsArray[r][c] == 'R' && r == 0){
                                doMoveUp=false;
                            }                          
                        }
                    }
                }
                if(!doMoveLeft&&!doMoveUp)
                    break;
                if(doMoveUp)
                    robotsArray=moveUp(robotsArray,row,column);
                if(doMoveLeft)
                    robotsArray=moveLeft(robotsArray,row,column);
            }
            System.out.println(done);
        }
    }

    public static char[][] moveLeft(char[][] array,int rows,int columns){
        char container;
        for(int r=0; r<rows; r++){
            for(int c=0; c<columns; c++){
                if(array[r][c] == 'R'){
                    container = array[r][c-1] ;
                    array[r][c-1] = 'R';
                    array[r][c]=container;
                }
            }
        }
        return array;
    }
    public static char[][] moveUp(char[][] array,int rows,int columns){
        char container;
        for(int r=0; r<rows; r++){
            for(int c=0; c<columns; c++){
                if(array[r][c] == 'R'){
                    container = array[r-1][c];
                    array[r-1][c] = 'R';
                    array[r][c]= container;
                }
            }
        }
        return array;
    }
}