import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void PrintFighterProperties() {

    }

    public void Run() {
        int i =0;
        if (IsCheck()) {
            while (this.f1.healt > 0 && this.f2.healt > 0) {
                System.out.println("<===>NEW ROUND<===>");
                if (IsFirstHit() && i==0){
                    this.f2.healt = f1.Hit(this.f2);
                    if (IsWin()) {
                        break;
                    }
                    this.f1.healt = f2.Hit(this.f1);
                    if (IsWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " health : " + this.f1.healt);
                    System.out.println(this.f2.name + " health : " + this.f2.healt);
                    System.out.println();

                } else if (IsFirstHit()==false && i ==0) {
                    this.f1.healt = f2.Hit(this.f1);
                    if (IsWin()) {
                        break;
                    }
                    this.f2.healt = f1.Hit(this.f2);
                    if (IsWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " health : " + this.f1.healt);
                    System.out.println(this.f2.name + " health : " + this.f2.healt);
                    System.out.println();
                } else {
                    this.f2.healt = f1.Hit(this.f2);
                    if (IsWin()) {
                        break;
                    }
                    this.f1.healt = f2.Hit(this.f1);
                    if (IsWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " health : " + this.f1.healt);
                    System.out.println(this.f2.name + " health : " + this.f2.healt);
                    System.out.println();
                }
                i++;
            }
        } else {
            System.out.println("These fighter can not fight together!");
        }
    }

    boolean IsCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean IsWin() {
        if (this.f1.healt == 0) {
            System.out.println("F2 won the match");
            return true;
        } else if (this.f2.healt == 0) {
            System.out.println("F1 won the match");
            return true;
        }
        return false;
    }

    boolean IsFirstHit() {
        Random random = new Random();
        int a = random.nextInt(0, 2);
        if (a == 1){
            return true;
        }
        return false;
    }

}
