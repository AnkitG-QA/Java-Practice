package loops;

import java.util.Scanner;

public class loop020
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A year");
        int year= sc.nextInt();
        if(year%4==0)
        {
            System.out.println("the year is leap year");
        }else {
            System.out.println("The year is not leap year");
        }
    }
}
