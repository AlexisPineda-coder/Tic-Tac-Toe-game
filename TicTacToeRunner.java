import java.util.Scanner;

public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        // Add your code for this exercise here
        Scanner input = new Scanner(System.in);
        TicTacToe board = new TicTacToe();
        System.out.println("Welcome to Tic-Tac-Toe!");
        while(board.checkTurn() == true && board.checkWin() == false)
        {
            board.printBoard();
            
            System.out.print("Enter Your Row Pick: ");
            int row = input.nextInt();
            
            System.out.print("Enter Your Col Pick: ");
            int col = input.nextInt();
            
            if (board.pickLocation(row,col))
            {
                board.takeTurn(row,col);
                
            }
            else
            {
                System.out.println("That space is taken, or you enterend an invalid row/col.");
            }
        }
        board.printBoard();
        
        if(board.checkWin())
        {
            if(board.getTurn()%2==0)
            {
               System.out.println("Winner!! O wins!!"); 
            }
            else
            {
                System.out.println("Winner!! X wins!!"); 
            }
        }
        else
        {
            System.out.println("Its a tie!!");
        }
        
        
        
    }
}