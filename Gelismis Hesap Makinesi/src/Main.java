import java.util.Scanner;

public class Main {

    static int sum (int a , int b){
        int result = a+b;
        System.out.println("Toplam : "+result);
        return result;
    }
    static int minus(int a , int b){
        int result = a-b;
        System.out.println("Çıkarma : "+result);
        return  result;
    }
    static int times(int a , int b){
        int result = a * b ;
        System.out.println("Çarpma : "+result);
        return result;
    }
    static int divided(int a , int b){
        if (b==0){
            return 0;
        }
        int result = a/b;
        System.out.println("Bölüm : "+result);
        return result;
    }
    static int power (int a , int b){
        int result =1;
        for (int i=1 ; i <=b ; i++){
            result *= a;
        }
        return result;
    }
    static int mod (int a, int b){
        return  a % b ;
    }
    static void calc(int a , int b){
        System.out.println("Çevresi : "+ 2 *(a+b));
        System.out.println("Alanı : "+ (a*b));
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select ;


        String menu = "1- Toplama İşlemi\n2-Çıkarma  İşlemi\n3-Çarpma  İşlemi\n4-Bölme  İşlemi\n5-Üslü sayı hesaplama \n6-Mod alma \n7-Dikdörtgen alan ve çevre hesabı \n0-Çıkış yap";

        System.out.println(menu);
        while (true){

            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 0){
                break;
            }
            System.out.println("İlk sayı : ");
            int a = scan.nextInt();
            System.out.println("İkinci sayı : ");
            int b = scan.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divided(a,b)==0){
                        System.out.println("İkinci sayı 0'dan farklı olmalı");
                    }
                case 5:
                    System.out.println( "Üst hesabı :"+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod işlemi : "+mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz !");

            }




        }






    }
}
