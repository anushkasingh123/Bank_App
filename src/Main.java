import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name , password and balance to create an account");


        String name= sc.next();
        String password= sc.next();
        double balance= sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);

        String message=user.addMoney(100000);
        System.out.println(message);
        System.out.println("kitne paise chahiye");
        int money= sc.nextInt();
        System.out.println("password btao");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));


    }
}