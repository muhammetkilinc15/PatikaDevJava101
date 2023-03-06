import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı değerini giriniz: ");

        int k = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int m = scanner.nextInt();
        System.out.println("Sonuç: "+power(k,m));
    }
    public static int power(int base,int exponent){

        if (exponent>0){
            return base*power(base,exponent-1);
        }else {
            return 1;
        }
    }
}