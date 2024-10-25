package Programs;

import java.util.Scanner;

public class conition007
{
    public static void main(String[] args)
    {
        int n1;
        int n2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Num First");
        n1=sc.nextInt();

        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter Num First");
        n2=sc1.nextInt();
        System.out.println(Math.max(n1,n2));
//        if(n1>n2){
//            System.out.println("n1 is max");
//        }else {
//            System.out.println("n2 is max");
//        }

    }
}
