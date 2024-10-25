package loops;

public class loop012
{
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++)
        {
            if (i%2==0)
            {
                System.out.println("print even ->" +i);
                continue;
            }else
            {
                System.out.println("print odd -> "+i);
            }
                continue;

        }
    }
}
