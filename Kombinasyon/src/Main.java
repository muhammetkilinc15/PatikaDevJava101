import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //faktoriyel hesapalama
        Scanner scan = new Scanner(System.in);
        int Nfactorial = 1, Rfactorial = 1, n, r, formul, subtraction, sFactorial = 1;
        System.out.println("Factorial Number 'n'  : ");
        n = scan.nextInt();

        System.out.println("Factorial Number 'r' : ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            Nfactorial *= i;
        }
        for (int o = 1; o <= r; o++) {
            Rfactorial = Rfactorial * o;
        }
        subtraction = (n - r);
        for (int p = 1; p <= subtraction; p++) {
            sFactorial = sFactorial * p;
        }

        formul = Nfactorial / (Rfactorial * sFactorial);
        System.out.println("C(" + n + "," + r + ")=" + formul);
    }
}










