public class TicTacToe
{
   // Copy over code from Tic-Tac-Toe Game, Part 1
    // Declare instance variables
    private String[][] board;
    private int turn;
    
    // Constructor that initializes the empty game board
    public TicTacToe()
    {
        // Initialize turn and board variables
        turn = 0;
        board = new String[3][3];
        for (int row = 0;row < board.length;row++)
        {
            for ( int col = 0; col < board[0].length;col++)
            {
                board[row][col]="-";
            }
        }
    }
    
    // Returns true if row and col is a valid, empty space
    public boolean pickLocation(int row, int col)
    {
        // Complete this method
        if(row >= 0 && row < board.length && col >= 0 && col < board[row].length)
        {
            if(board[row][col] == "-")
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    // Places an X or O at location (row, col) based on the turn value
    public void takeTurn(int row, int col)
    {
        // Complete this method
        if (turn % 2 == 0)
        {
            board[row][col] = "X";
            turn++;
        }
        else
        {
            board[row][col] = "O";
            turn++;
        }


        
    }
    
    // Returns the current turn
    public int getTurn()
    {
        // Complete this method
        return turn;

    }

    // Returns true if a single row has three X or O's
    public boolean checkRow()
    {
        // Complete this method
        int xCount = 0;
        int oCount = 0;
        for (int row = 0;row < board.length;row++)
        {
            for ( int col = 0; col < board[0].length;col++)
            {
                if(board[row][col] == "X")
                {
                    xCount++;
                }
                else if (board[row][col] == "O")
                {
                    oCount++;
                }
                if(xCount == 3 || oCount == 3)
                {
                    return true;
                }
            }
            xCount =0;
            oCount =0;
        }
        return false;



        
    }
    
    // Returns true if a single column has three X or O's
    public boolean checkCol()
    {
        // Complete this method
        int xCount = 0;
        int oCount = 0;
        for (int col = 0;col < board[0].length;col++)
        {
            for ( int row = 0; row < board.length;row++)
            {
                if(board[row][col] == "X")
                {
                    xCount++;
                }
                else if (board[row][col] == "O")
                {
                    oCount++;
                }
                if(xCount == 3 || oCount == 3)
                {
                    return true;
                }
            }
            xCount =0;
            oCount =0;
        }
        return false;
        

    }

    // Returns true if a diagonal has three X or O's
    public boolean checkDiag()
    {
        // Complete this method
        if(board[0][0]=="X" && board[1][1]=="X" && board[2][2]=="X" || 
        board[0][0]=="O" && board[1][1]=="O" && board[2][2]=="O")
        {
            return true;
        }
        else if(board[0][2]=="X" && board[1][1]=="X" && board[2][0]=="X" ||
        board[0][2]=="O" && board[1][1]=="O" && board[2][0]=="O")
        {
            return true;
        }
        else
        {
            return false;
        }


        
    }

    // Returns true if the turn count is less than the max (9)
    public boolean checkTurn()
    {
        // Complete this method
        if(turn < 9)
        {
            return true;
        }
        else
        {
            return false;
        }


    }
    
    // Returns true if someone has won the game
    public boolean checkWin()
    {
        // Complete this method
        if(checkRow() || checkCol() || checkDiag())
        {
            return true;
        }
        else
        {
            return false;
        }


    }

    // Prints out the board array on to the console
    public void printBoard()
    {
        // Complete this method
        for ( int col = 0; col < board.length;col++)
        {
            System.out.print("  " + col);
        }
        System.out.println();
        for (int row = 0;row < board.length;row++)
        {
            System.out.print(row + " ");
            for ( int col = 0; col < board[0].length;col++)
            {
                System.out.print(board[row][col] + "  ");
                
            }
            System.out.println();
        }


        
    }
   
   
   
}