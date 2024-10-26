package Functions;

public class Fun002 {
    public static void main(String[] args) {
        type01();
        type02();
        type03("Ankit");
        int result=type04(34,6);
        System.out.println(result);

    }

    static void type01() {
        System.out.println("Function Type 01 ");
    }

    static String type02() {
        System.out.println("Function type 02");
        return "aNKIT";
    }

    static void type03(String name) {
        System.out.println("Function type 03");
        System.out.println("you have share ->" + name);
    }

    static int type04(int a, int b) {
        System.out.println("Function type 04");
        return a + b;
    }
}
