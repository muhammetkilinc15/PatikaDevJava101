import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Sayi Gir: ");
            number = input.nextInt();
            if (prime(number, 10)) {
                System.out.println(number + " Asal Sayidir...");
            } else {
                System.out.println(number + " Asal Degildir...");
            }
        }
    }
    public static boolean prime(int number, int divider) {
        if (number < 2) {
            return false;
        } else if (divider == 1) {
            return true;
        } else {

            if (number % divider == 0) {
                return false;
            } else {
                return prime(number, divider-1);
            }
        }
    }
}