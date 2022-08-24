import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //  = list[0] , min < list[i] ?  min = list[1] :
        // max = list [0] , max > list[i] ?  max = list[i] :
        Scanner inp = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.println("Entered Number : ");
        int number = inp.nextInt();

        Arrays.sort(list);


        for(int i : list){
            if (i < number){
                min = i;
            }
            if (i > number){
                max = i;
                break;
            }
        }
        System.out.println("Nearest and Min Number to Entered Number : " + min);
        System.out.println("Nearest and Max Number to Entered Number : " + max);

    }



}