import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number , sayac;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı  giriniz :  ");
        number= inp.nextInt();


        for (int i = 2 ; i<=number;i++ ){

            sayac = 0;
            for (int k = 2 ; k <i ; k++) {
                if (i % k == 0) {
                    sayac++;
                }
            }
            if (sayac ==0){
                System.out.println(i + " ");
            }



        }











    }
}
