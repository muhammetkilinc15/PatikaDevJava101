import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scanner.nextInt();
        int ebob = 0, ekok = 1;
        int count = 1;
        int small = Math.min(num1, num2);
        while (count <= small) {

            if (num1 % count == 0 && num2 % count == 0) {
                ebob = count;
            }
            count++;
        }
        for (int i = 1; i<=(num1*num2);i++){
            if (i % num1==0 && i % num2==0)
            {
                ekok = i;
                break;
            }
        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}