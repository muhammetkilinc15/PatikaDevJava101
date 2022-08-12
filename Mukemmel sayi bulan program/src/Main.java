import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number , sum=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mükemmle sayı sorgulaması yapacagımız sayı : ");
        number=inp.nextInt();

        for (int i=1 ; i <number ; i ++){
            if (number % i == 0){
                sum += i;

            }
        }

        if (number ==sum ){
            System.out.println("Sayınız Mükemmel sayıdır !!!");
        }else {
            System.out.println("Sayiniz mükemmel sayı değildir !!!");
        }



















    }
}
