package Programs;

import java.util.Scanner;

public class condition009
{
    public static void main(String[] args) {
        int n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        n1=sc.nextInt();
        if(n1>=90&&n1<=100)
        {
            System.out.println("A");
        } else if (n1<=89&&n1>=80) 
        {
            System.out.println("B");
        } else if (n1<=79&&n1>=70)
        {
            System.out.println("C");
        } else if (n1<=69&&n1>=60)
        {
            System.out.println("D");
        }else
        {
            System.out.println("Fail");
        }
    }
}
