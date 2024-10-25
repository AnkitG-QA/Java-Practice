package Programs;

import java.util.Scanner;

public class condition018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("age is postive");
        } else if (age < 18) {
            System.out.println("age is negative");
        } else {
            System.out.println("age is out");
        }
    }
}
