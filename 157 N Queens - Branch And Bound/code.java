import java.io.*;
import java.util.*;

public class Main {


  public static void  safeQueen(boolean[][] board, int row, boolean []di, boolean [] col, boolean []rdi, String asf) {



    if (row == board.length) {
      System.out.println(asf + ".");
      return;
    }

    for (int i = 0 ; i < board[row].length ; i++) {

      if (board[row][i] == false && col[i] == false && di[row + i] == false &&
          rdi[row - i + board.length - 1] == false
         )    {
        board[row][i] = true;
        col[i] = true;
        di[row + i] = true;
        rdi[row - i + board.length - 1] = true;

        safeQueen(board, row + 1, di, col, rdi, asf + row + "-" + i + ", ");

        board[row][i] = false;
        col[i] = false;
        di[row + i] = false;
        rdi[row - i + board.length - 1] = false;
      }

    }

  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    boolean [] col = new boolean[n];
    boolean []di = new boolean[(2 * n) - 1];
    boolean []rdi = new boolean[(2 * n) - 1];
    safeQueen(board, 0, di, col, rdi, "");
  }


}




















