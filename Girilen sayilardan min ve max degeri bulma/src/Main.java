import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number, quality,max=1,min=1;


        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç tane değer gireceksiniz ?");
        quality=inp.nextInt();

        for (int i =1 ; i<=quality; i++) {
            System.out.println("Sayı giriniz : ");
            number=inp.nextInt();

            if(i==1) {
                max = number;
                min = number;
            } else if (number>max) {
                max = number;
            } else if (number < min) {
                min = number;
            }


        }
        System.out.println("Max değer : "+max);
        System.out.println("Min değer : "+min);


    }
}
