import java.util.*;


public class TicTacToe{
   public static void main(String[] args){
      char[][] gameBoard = 
         {{' ','|',' ','|',' '},
          {'-','+','-','+','-'},
          {' ','+',' ','+',' '},
          {'-','+','-','+','-'},
          {' ','|',' ','|',' '}    
         };
                           
         printGameBoard(gameBoard);
         
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter your placement (1-9: ");
         int pos = scan.nextInt();
         
         System.out.println(pos);
}// end main
   

public static void printGameBoard(char[][] gameBoard){
            for (char[] row : gameBoard){
            for(char c : row){
               System.out.print(c);
            }
            System.out.println();
      }
   }
}// end class