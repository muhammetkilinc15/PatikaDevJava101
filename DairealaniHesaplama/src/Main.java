import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    /*
    *Author = Muhammet kılınc
    /Write a program that finds the area of a circle of radius r and finds the measure 𝛼 of the central scale..
    𝜋 sayısını = 3.14 alınız.
    Formula : (𝜋 * (r*r) * 𝛼) / 360
    */
        // Variables
        int r;
        int a;
        double area;
        double pi = 3.14;

        // Get data from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius value: ");
        r = input.nextInt();

        System.out.print("\n Enter the measure of the central angle: ");
        a = input.nextInt();

        //Calculate the area of the circle and print it to the screen
        area = (pi * (r * r) * a) / 360;

        System.out.println("area of the circle: " + area);


    }
}
