import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lenght: ");
        int a = input.nextInt();
        findFibonacci(a);
    }
    public static void findFibonacci(int step) {
        int temp1 = 1;
        int temp2 = 0;
        for (int i = 1; i <= step; i++) //0 1 1 2 3 5 8 13
        {
            int sum = temp1 + temp2;
            System.out.print(sum + " ");
            temp1 = temp2;
            temp2 = sum;
        }


    }
}