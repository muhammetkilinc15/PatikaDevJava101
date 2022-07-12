import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp ;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz : ");
        temp=input.nextInt();


        if (temp <= 5){
            System.out.print("Kayak yapabilirsiniz!");
        } else if ((temp >5) && (temp <=15)) {
            System.out.print("Sinemaya gidebilirsiniz!");
        } else if (temp >= 25 ) {
            System.out.print("Yüzmeye gidebilirsiniz!");
        } if (temp >10 && temp <=25) {
            System.out.println(" Veya piknik yapabilirsiniz!");
        }


    }
}
