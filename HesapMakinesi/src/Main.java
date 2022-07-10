import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Author = Muhammet Kılınc
        *
        
        */
        


        // variables
        int n1 , n2, select;

        //kullanıcıdan sayıları alalım
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz : ");
        n1=input.nextInt();
        System.out.println("2.Sayıyı giriniz : ");
        n2=input.nextInt();

        // Hangi dört işlemi yapıcagımızı sectirelim
        System.out.println("1-Toplama \n 2-Cıkarma \n 3-Carpma \n 4-Bölme");
        System.out.println("Seçiminiz : ");
        select =input.nextInt();

        // Switch-case ile hangi işlemi yaptıracagımızı sectiriyoruz.

        switch (select) {
            case 1:
                System.out.println("Toplam : "+(n1+n2));
                break;
            case 2:
                System.out.println("Cıkarma : "+(n1-n2));
                break;
            case 3:
                System.out.println("Carpöa : "+ (n1*n2));
                break;
            case 4:

                if (n2==0){
                    System.out.println("Bir sayı 0'a bölünemez. ");
                }else {
                    System.out.println("Bolme : " + (n1 / n2));
                }
                break;
            default:
            System.out.println("Gecersiz secim yaptınız .");
        }
    }
}
