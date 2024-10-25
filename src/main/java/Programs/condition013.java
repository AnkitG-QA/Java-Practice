package Programs;

import java.util.Scanner;

public class condition013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);
        switch (user_input) {
            case 'a':
                System.out.println("it is vowel");
                break;
            case 'e':
                System.out.println("it is vowel");
                break;
            case 'i':
                System.out.println("it is vowel");
                break;
            case 'o':
                System.out.println("it is vowel");
                break;
            case 'u':
                System.out.println("it is vowel");
                break;
            default:
                System.out.println("it is no vowel");
        }
    }
}
