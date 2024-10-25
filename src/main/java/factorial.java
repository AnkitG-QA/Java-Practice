import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int A=sc.nextInt();

        int fact=A;
        int n;//
        for (int i=1;i<=A;i++)

        {
            fact=A*i;
        }

            System.out.println("factorial of Number" +fact);

    }
}
