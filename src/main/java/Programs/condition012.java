package Programs;

import java.util.Scanner;

public class condition012
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= sc.next();
        System.out.println(browser.toLowerCase());
        switch (browser)
        {
            case "Chrome":
                System.out.println("Chrome");
                break;
            case "edge":
                System.out.println("edge");
                break;
            case "firefox":
                System.out.println("firefox");
                break;
            default:
                System.out.println("other browser");
        }
    }
}
