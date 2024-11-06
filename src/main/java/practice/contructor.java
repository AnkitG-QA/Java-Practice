package practice;

public class contructor
{
    static int x,y,z;
    contructor(){
        System.out.println("Ankit.....");
        this.x=10;
        this.y=4;
        this.z=3;


    }
    /*contructor(int x, int y){
        int c;
        this.x=20;
        this.y=30;
        c=x+y;
        System.out.println("The addition is..."+c);
    }*/

    public static void add()
    {
        int c;
        c=x+y;
        System.out.println("Addition num"+c);
    }
    public static void main(String[] args)
    {
        contructor c =new contructor();
        //contructor p=new contructor(10,5);
        //System.out.println("Default constructor: "+add);


        add();
        method();

    }
    static void method()
    {
        System.out.println("hello");
    }

}
