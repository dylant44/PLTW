import java.util.Scanner;
import java.util.ArrayList;

public class TestScores
{
    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        int addScore = 0;

        System.out.println("Enter test scores");
        while (addScore != 999)
        {
            System.out.println("Enter score: ");
            addScore = keyboard.nextInt();
            scores.add(addScore);
        }
        scores.remove(scores.indexOf(999));

        display(scores);
    }

    public static void display(ArrayList<Integer> scores)
    {
        int total = 0;
        int average;

        System.out.println("Test scores: " + scores);

        for (int j = 0; j < scores.size(); ++j)
        {
            total = total + scores.get(j);
        }
        average = total / scores.size();
        System.out.println("Total: " + total + "\nAverage: " + average);

    }
}
