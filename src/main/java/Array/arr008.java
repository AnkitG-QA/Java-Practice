package Array;

import java.util.Scanner;

public class arr008
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        float total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter The Marks " + (i + 1) + ":");
            marks[i] = sc.nextFloat();
            total += marks[i]; // Accumulate the total marks
        }

        float avg = total / marks.length; // Calculate the average
        System.out.println("Average marks of all subjects is: " + avg);

    }
}
