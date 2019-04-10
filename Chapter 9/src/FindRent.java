import javax.swing.*;
public class FindRent
{
    public static void main(String[] args)
    {
        int[][] rents = {{400, 450, 510, 505},
                {500, 560, 625, 635},
                {640, 676, 740, 800},
                {1000, 1250, 1600, 1650},
                {1700, 1750, 1800, 1850},
                {1900, 1950, 2000, 2100}};

        String entry;
        int floor;
        int bedrooms;

        entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
        bedrooms = Integer.parseInt(entry);

        if ((bedrooms > 3 || bedrooms < 0) || floor > 5 || floor < 0)
        {
            JOptionPane.showMessageDialog(null, "That room doesn't exist");
        }

        JOptionPane.showMessageDialog(null, "The rent for a " +
                bedrooms + " bedroom apartment on floor " + floor + " is $" + rents[floor][bedrooms]);
    }
}
