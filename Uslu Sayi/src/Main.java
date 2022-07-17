import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        -> Use the "For Loop" program that calculates exponential numbers with the values entered by the user in Java.
        -> Author : Muhammet Kılınç



        */



        int n,k ;
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the number to be exponentiated : "); //üsüü oluncak sayıyı giriyoruz!
        n=input.nextInt();

        System.out.println("Number to top : ");  // üs olucak sayuyu giriyoruz!
        k=input.nextInt();

        int total = 1 ;


        // 3^4 = 3*3*3*3

        for (int i =1; i<=k; i++){

            total *=n;
        }
        System.out.println("Cevap : "+total);








    }
}
