import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    /*
    Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

    Çin Zodyağı nedir?
    4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
    Çin Zodyağı nasıl hesaplanır?
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
     */
        int dogumYili,sonuc;
        String burc =" ";

        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        dogumYili=scan.nextInt();

        sonuc= dogumYili%12;

        if (sonuc==0){
            burc="Maymun";
        } else if (sonuc==1) {
            burc="Horoz";
        } else if (sonuc==2) {
            burc="Köpek";
        } else if (sonuc==3) {
            burc="Domuz";
        } else if (sonuc==4) {
            burc="Fare";
        } else if (sonuc==6) {
            burc="Kaplan";
        }else if (sonuc==7) {
            burc="Tavşan";
        }else if (sonuc==8) {
            burc="Ejderha";
        }else if (sonuc==9) {
            burc="Yılan";
        }else if (sonuc==10) {
            burc="At";
        }else if (sonuc==11) {
            burc="Koyun";
        }
        System.out.println("Çin zodyağı burunuc : "+burc);
    }
}
