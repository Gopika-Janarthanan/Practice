package ConsoleApp.BankApp;
import java.util.Scanner;
public class Main {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ON Demanding App");
        System.out.println(" 1.Register \n 2.Login \n 3.Exit");
        System.out.println("Enter your choice : ");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                register();
                break;
            case 2:
                login();
                break;
            case 3:
                logout();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

    static void  register(){
        System.out.println("Register ");

    }
    static void login(){
        System.out.println("Login");
    }
    static void logout(){
        System.out.println("Exit");

    }

}
