import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // I use the infinity loop for infinıty input.
        do
        {
            try {
                System.out.print("Enter a number: ");
                int number = input.nextInt();
                if (IsArmstrog(number))
                {
                    System.out.println(number+" is armstrog number");
                }else {
                    System.out.println(number+ " is not armstrog number");
                }
            }catch (InputMismatchException e)
            {
                System.out.println(e.getMessage());
            }
        }while (true);
    }
    // This method check the number is armstrong or not armstrong
   public static boolean IsArmstrog(int number)
    {
        int num;
        int digit=0;
        int total=0;
        int tempNumber = number;
        // I found the digit with this loop
        while (tempNumber!=0)
        {
            digit++;
            tempNumber=tempNumber/10;
        }
        tempNumber=number;
        // I took the exponent of each digit by the number of digits.
        while (tempNumber!=0)
        {
            num = tempNumber%10;
            total += Pow(num,digit);
            tempNumber = tempNumber/10;
        }
        return total == number;
    }
    public static int Pow(int number,int pow)
    {
        int result=1;
        for (int i = 0; i< pow;i++)
        {
            result*=number;
        }
        return  result;
    }
}