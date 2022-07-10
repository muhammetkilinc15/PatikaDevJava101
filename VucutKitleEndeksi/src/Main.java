import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double boy , kilo, vDurum ;

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz : ");
        boy=input.nextDouble();

        System.out.println("Kilonuzu kg cinsinden giriniz : ");
        kilo=input.nextDouble();

        vDurum= (kilo/(boy*boy));
        System.out.println("Vücut kitle endeksiniz : "+vDurum);





















    }
}
