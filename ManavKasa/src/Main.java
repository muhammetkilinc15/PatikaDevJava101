import java.sql.ParameterMetaData;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armutF = 2.14, ElmaF = 3.67 , domatesF= 1.11,muzF= 0.95,patlicanF = 5.00 , tutar ;
        double Armut,Elma,Domates,Muz,Patlican;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kac kg : ");
        Armut=input.nextDouble();

        System.out.println("Elma kac kg");
        Elma=input.nextDouble();

        System.out.println("Domates kac kg");
        Domates=input.nextDouble();

        System.out.println("Muz kac kg");
        Muz=input.nextDouble();

        System.out.println("Patlıcan kac kg");
        Patlican=input.nextDouble();

        tutar= armutF*Armut+Elma*ElmaF+Domates*domatesF+muzF*Muz+patlicanF*Patlican;
        System.out.println("Toplam tutar : "+tutar);

    }
}
