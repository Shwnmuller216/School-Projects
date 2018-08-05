import java.util.Scanner;

/**
This program runs a TicTacToe game. It prompts the
user to set positions on the board and prints out the
result.
 */
public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe game = new TicTacToe();

        boolean done = false;
        while (!done)
        {
            if(game.win(player) == true){
                done = true; // ends while loop
                System.out.println((player)+(" wins")); //says either x or o wins
            }
            System.out.print(game.toString()); 
            System.out.println("Row for " + player + " (-1 to exit): ");
            int row = in.nextInt();
            if(row > 2 || row < -1)
            {
                System.out.println("Out of Bounds");  
                while(row > 2 || row < -1){
                    System.out.println("Row for " + player + " (-1 to exit): ");
                    row = in.nextInt();
                }
            } 
            if (row < 0) 
                done = true;
            else
            {
                System.out.print("Column for " + player + ": ");
                int column = in.nextInt();
                if(column > 2 || column < -1)
                {
                    System.out.println("Out of Bounds");    
                    while(row > 2 || row < -1){
                System.out.print("Column for " + player + ": ");
                column = in.nextInt();
                }
                }   
                if(game.out(row,column) == true)
                {
                    player = player;

                }
                else {

                    game.set(row, column, player);
                    if (player.equals("x")) 
                        player = "o"; 
                    else 
                        player = "x";  
                }
            }
        }
    }
}