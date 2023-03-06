import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");
        figure(n, true, n);

    }

    public static void figure(int number, boolean isFlag, int temp) {
        System.out.print(number + " ");
        if (number > 0 && isFlag) {
            figure(number - 5, true, temp);
        } else {
            if (number == temp) {
                return;
            }
            figure(number + 5, false, temp);
        }
    }
}