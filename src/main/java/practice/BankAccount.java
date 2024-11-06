package practice;

public class BankAccount
{
    String bankname;
    int bal;
    String bankcode;

    public BankAccount() {
        bankname="SBI";
        bal=848494;
        bankcode="SBI0009";

    }

    void printdetails()
    {
        System.out.println("bankname ->"+bankname);
        System.out.println("bal ->"+bal);
        System.out.println("bankcode ->"+bankcode);
    }
}
