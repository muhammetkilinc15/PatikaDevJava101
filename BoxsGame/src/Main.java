import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,100,30);
        Fighter f2 = new Fighter("B",20,85,85,40);

        Ring ring1 = new Ring(f1,f2,80,100);
        ring1.Run();
        Random random = new Random();

    }
}