public class checkerBoard
{
    public static void main(String[] args)
    {
        String[][] board = new String[8][8];

        for (int i = 0; i < board.length; i++)
        {
            int count = 0;
            for (int j = 0; j < board.length; j++)
            {
                count++;
                if (j % 2 == 0)
                {
                    System.out.print(" W ");
                }
                    else
                    {
                    System.out.print(" B ");
                    }
                if(count == 8)
                {
                    System.out.println(" ");
                }
            }
        }

        // Print out the board as 8 rows with either null,
        // "BLACK", or "WHITE" in each element
        // Hint: use both the println and print methods
        // of System.out

    }
}
