/**
     A 3 x 3 tic-tac-toe board.
  */
  public class TicTacToe
  {
     private String[][] board;
     private static final int ROWS = 3;
     private static final int COLUMNS = 3;
  
     /**
        Constructs an empty board.
     */
     public TicTacToe()
     {
        board = new String[ROWS][COLUMNS];
        // Fill with spaces
        for (int i = 0; i < ROWS; i++)
           for (int j = 0; j < COLUMNS; j++)
              board[i][j] = " ";
     }
     
     /**
        Sets a field in the board. The field must be unoccupied.
        @param i the row index 
        @param j the column index 
        @param player the player ("x" or "o")
     */
     public void set(int i, int j, String player)
     {
         if (i >-1 && i < 3){
        if (board[i][j].equals(" "))
           board[i][j] = player;
        }
        
     }

     
     /*Creates a string representation of the board, such as
        |x  o|
        |  x |
        |   o|
        @return the string representation
     */
     public String toString()
     {
        String r = "";
        for (int i = 0; i < ROWS; i++)
        {
           r = r + "|";
           for (int j = 0; j < COLUMNS; j++)         
              r = r + board[i][j];
           r = r + "|\n";
        }
        return r;
     }
     public boolean out(int i, int j)
     {
        
         boolean check = false;
         if(i > 2 || i < -1)
              {
              check = false;    
            } 
          else if(j > 2 || j < -1)
              {
              check = false;    
            }    
        else if(board[i][j].equals("x") || board[i][j].equals("o"))
        
           check  = true;
           
           
           return check;
     }
     public boolean win(String str){
      boolean Bob = false;
      if((board[0][0].equals(str)) && (board[0][1].equals(str)) && 
      (board[0][2].equals(str)))
      Bob = true;
       if((board[1][0].equals(str)) && (board[1][1].equals(str)) && 
      (board[1][2].equals(str)))
      Bob = true;
       if((board[2][0].equals(str)) && (board[2][1].equals(str)) && 
      (board[2][2].equals(str)))
      Bob = true;
      if((board[0][0].equals(str)) && (board[1][0].equals(str)) && 
      (board[2][0].equals(str)))
      Bob = true;
      if((board[0][1].equals(str)) && (board[1][1].equals(str)) && 
      (board[2][1].equals(str)))
      Bob = true;
      if((board[0][2].equals(str)) && (board[1][2].equals(str)) && 
      (board[2][2].equals(str)))
      Bob = true;
      if((board[0][0].equals(str)) && (board[1][1].equals(str)) && 
      (board[2][2].equals(str)))
      Bob = true;
      if((board[0][2].equals(str)) && (board[1][1].equals(str)) && 
      (board[2][0].equals(str)))
      Bob = true;
      
      
      return Bob;
       }
  }

