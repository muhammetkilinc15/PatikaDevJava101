import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right =3;
        int balance = 1500;
        int select;
        int price;

        while (right>0){
            System.out.println("Enter you username : ");
            userName=inp.nextLine();
            System.out.println("Enter your password : ");
            password=inp.nextLine();
            if (userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Login the system. Welcome to X banks :) ");
               do {
                   System.out.println(" 1-deposit(Para yatırma) \n 2-Withdraw money(Para Çekme) \n 3-balance inquiry(Bakiye Sorgula) \n 4-Log out(Çıkış yap)");
                   System.out.println("Please choose what you want to do ");
                   select = inp.nextInt();
                   switch (select){
                       case 1:
                           System.out.print("Amount of money : ");
                            price =inp.nextInt();
                           balance += price;
                           break;
                       case  2:
                           System.out.print("Amount of money :");
                            price =inp.nextInt();
                           if (price> balance){
                               System.out.println("İnsufficient balance");
                           }else {
                               balance -= price;
                           }
                           break;
                       case 3:
                           System.out.println("Your balance : "+balance);
                       default:
                           System.out.println("Please enter a valid number");

                   }
               }while (select !=4);
               break;


            }else {
                right--;
                System.out.println("The username or password is incorrect. Try again.");
                if (right==0){
                    System.out.println("Your account has been blocked. Contact the bank");
                }else {
                    System.out.println("Your remaining right : "+ right);
                }

            }

        }


    }
}
