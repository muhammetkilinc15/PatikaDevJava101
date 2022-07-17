import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("N sayısı giriniz : ");
       int number = input.nextInt();


       double result=0.0 ;
       double k=1;
       while (k<=number){

           result += 1/k;

           k++;
       }System.out.println( "Sonuc : "+result);






    }
}
