package Array;

public class arr003
{
    public static void main(String[] args) {
        int[] marks=new int[3];
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        marks[0]=90;
        marks[1]=91;
        marks[2]=92;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        for (int i = 0; i <marks.length ; i++)
        {
            System.out.println(marks[i]);
            System.out.println(i);
        }

    }
}
