import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km,age,ttyp;
        Scanner scan =new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km= scan.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age= scan.nextInt();

        System.out.print("1-Tek Yön \n2-Gidiþ Dönüş \nLütfen yolculuk tipini seçiniz: ");
        ttyp= scan.nextInt();

        double normalTutar= 0.1*km;

        if (ttyp==2) {
            normalTutar=normalTutar*0.8*2;
        }if (age <1 || ttyp>2 || ttyp<1 || km<1) {
            System.out.println("Hatalı veri girdiniz!");
        } else if (age <12) {
            System.out.println("Ödemeniz gereken tutar: " +normalTutar*0.5+ " TL");
        } else if (age >=12 && age <24) {
            System.out.println("Ödemeniz gereken tutar: "+normalTutar*0.9+ " TL");
        } else if (age >=65) {
            System.out.println("Ödemeniz gereken tutar: "+normalTutar*0.7 + " TL" );
        } else {
            System.out.println("Ödemeniz gereken tutar: " +normalTutar +" TL");
        }
    }
}


