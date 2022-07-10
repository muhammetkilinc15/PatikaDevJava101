import java.util.Scanner;
public class Main {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);

        double km, tutar, fiyat = 2.20;

        int acilis = 10;

        System.out.println("Gidilen kilometreyi giriniz: ");
        km = scan.nextDouble();

        tutar = (km * fiyat) + acilis;
        tutar = (tutar<20) ? 20 : tutar;

        System.out.println("Ödenmesi gereken tutar: " + tutar);














    }
}
