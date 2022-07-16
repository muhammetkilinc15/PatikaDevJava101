import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
       Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        */

        int limit,sayiAdet=0,toplam=0 ;
        double ortalama;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        limit=keyboard.nextInt();

        for (int i =1;i<=limit;i++){
            if (i%3==0 && i%4==0){
                toplam +=i;
                sayiAdet++;
            }
        }
        ortalama=toplam /sayiAdet;

        System.out.println(ortalama);




    }
}