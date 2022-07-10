import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    /*
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
    */
        // Değişkenler
        int r;
        int a;
        double area;
        double pi = 3.14;

        // Kullanıcıdan verileri al
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap değerini giriniz: ");
        r = input.nextInt();

        System.out.print("\nMerkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        // Dairenin alanını hesapla ve ekrana yazdır
        area = (pi * (r * r) * a) / 360;

        System.out.println("Girilen dairenin alanı: " + area);


    }
}
