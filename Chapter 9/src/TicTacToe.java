import javax.swing.JOptionPane;
import java.awt.*;
import java.util.Arrays;

public class TicTacToe
{
    public static void main(String[] args)
    {
        int[][] gameBoard = {{1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}};

        //JOptionPane.showMessageDialog(null,"Welcome to Tic Tac Toe!");
        for (int i = 0; i <= 2; ++i)
        {
            for(int j = 0; j <= 2; ++j)
            {
                System.out.print(gameBoard[i][j]);
                if(gameBoard[i][j] == 3 || gameBoard[i][j] == 6)
                {
                    System.out.println("");
                }
            }
        }

    }
}

