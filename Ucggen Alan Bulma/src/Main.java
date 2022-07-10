import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double  a,b,c,u,cevre,koklu;
        Scanner input=new Scanner(System.in);

        System.out.print(" a Kenarini Uzunlugunu Giriniz : ");
        a=input.nextDouble();
        System.out.print(" b Kenarini Uzunlugunu Giriniz : ");
        b=input.nextDouble();
        System.out.print(" c Kenarinin Uzunlugunu Giriniz : ");
        c=input.nextDouble();

        u=(a+b+c)/2;
        cevre=2*u;
        System.out.println("Ucgenin Cevresi : "+ cevre);
        koklu=u*(u-a)*(u-b)*(u-c);
        System.out.println("Ucgenin Alani : "+Math.pow(koklu,1.0/2.0));


    }
}
