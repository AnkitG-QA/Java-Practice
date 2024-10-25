package Programs;

import java.util.Scanner;

public class condition008
{
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner Sc=new Scanner(System.in);
        System.out.println("eNTER fIRST nUMBER");
        n1=Sc.nextInt();
        Scanner Sc1=new Scanner(System.in);
        System.out.println("eNTER second nUMBER");
        n2=Sc1.nextInt();
        if(n1>0&&n2>0)
        {
            System.out.println("positive");
        }else
        {
            System.out.println("negative");
        }

    }
}
