import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][]arr= new int[n][n];
        
        int r = scan.nextInt();
        int c = scan.nextInt();
         printKnightsTour(arr,r,c,1);
        
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(r <= -1 || c <= -1 || r >= chess.length || c >= chess[0].length || chess[r][c] > 0 ){
            
            return;
        }
        if(upcomingMove == chess.length* chess.length){
        
          chess[r][c] = upcomingMove;
          displayBoard(chess);
          chess[r][c] =0 ;
        return;
        }
        
        chess[r][c] = upcomingMove;
        upcomingMove++;
        
        // displayBoard(chess);
        printKnightsTour(chess,r-2,c+1,upcomingMove);
        printKnightsTour(chess,r-1,c+2,upcomingMove);
        printKnightsTour(chess,r+1,c+2,upcomingMove);
        printKnightsTour(chess,r+2,c+1,upcomingMove);
        printKnightsTour(chess,r+2,c-1,upcomingMove);
        printKnightsTour(chess,r+1,c-2,upcomingMove);
        printKnightsTour(chess,r-1,c-2,upcomingMove);
        printKnightsTour(chess,r-2,c-1,upcomingMove);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}