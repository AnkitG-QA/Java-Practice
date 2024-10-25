package Programs;

import java.util.Scanner;

public class condition011
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day from 1 to 7 ");
        int day= sc.nextByte();

        switch (day)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("wed");
            break;
            case 4:
            System.out.println("Thureday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("sat");
            break;
            case 7:
            System.out.println("sun");
            break;
            default:
                System.out.println("not know which day it is");
                break;
        }
        System.out.println("Fail");
    }
}
