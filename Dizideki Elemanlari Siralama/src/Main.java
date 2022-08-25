import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin boyunu n :");
        n = inp.nextInt();

        int[] list = new int[n];
        System.out.println("Dizinin Elemanlarını giriniz : ");
        for (int i = 0 ; i < list.length ; i++){
            System.out.println((i + 1) + ". Elemanı : ");
            list[i] = inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println( "Sıralama : " +  Arrays.toString(list));


    }
}
