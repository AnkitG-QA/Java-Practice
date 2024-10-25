package Programs;

public class condition015
{
    public static void main(String[] args) {
        int itemcode=1090;
        //System.out.println();
        switch (itemcode)
        {
            case 001 -> System.out.println("this is laptop");
            case 002 -> System.out.println("this is computer");
            case 101 -> System.out.println("this is gaming laptop");
            default -> System.out.println("this is unknown");
        }
    }
}
