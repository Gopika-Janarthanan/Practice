package ConsoleApp;

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    static int usercount =0;
    public static void main(String[] args){

        while(true){
            System.out.println(" 1.Register \n 2.Login \n 3.Exist");
            System.out.println("Enter your choice");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("invalid choice");
            }
            break;
        }
    }

    static void register(){
        int userid= usercount+1;
        System.out.println("Enter your name : ");
        String name=input.nextLine();
        System.out.println("Enter your password : ");
        String password=input.nextLine();

    }
    static void login() {
        System.out.println("Enter your email :");

    }
}
