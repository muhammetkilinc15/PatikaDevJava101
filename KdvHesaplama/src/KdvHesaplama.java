import java.util.Scanner;
public class notOrtalamasi {
        public static void main(String[] args) {
            
                 /*
            Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
            programı yazın.
            Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8
            olarak KDV tutarı hesaplayan programı yazınız.
         */

        // Değişkenler
        double kdvOran, kdv, kdvsizFiyat, kdvliFiyat;
        boolean kdvDurumu;

        // Kullanıcıdan verileri al
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ürün tutarını giriniz: ");
        kdvsizFiyat = keyboard.nextInt();

        // KDV oranını belirle
        kdvDurumu = (0 < kdvsizFiyat) && (1000 > kdvsizFiyat);
        kdvOran = kdvDurumu ? 0.18d : 0.08d;

        // KDV miktarını ve KDV'li fiyatı hesapla ve ekrana yaz
        kdv = kdvsizFiyat * kdvOran;
        kdvliFiyat = kdv + kdvsizFiyat;

        System.out.println("KDV miktarı: " + kdv);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);


    }
}
