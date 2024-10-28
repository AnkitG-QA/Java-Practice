package Array;

public class arr009
{
    public static void main(String[] args) {
        int [] sal={40000,30000,50000,60000};
        int max=1;
        for (int i = 0; i <sal.length ; i++) {
            if (sal[i]>max)
            {
              max=sal[i];
            }

        }
        System.out.println(max);
    }
}
