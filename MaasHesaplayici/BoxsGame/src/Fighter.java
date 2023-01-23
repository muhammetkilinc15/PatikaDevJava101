import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int healt;
    int weight;
    double dodge;


    Fighter(String name, int damage, int healt, int weight,double dodge) {
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.weight = weight;
        this.dodge= dodge;
    }

    int Hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " sporcusuna " + this.damage + " hasar vurdu.");
       if (foe.IsDodge())
       {
           System.out.println(foe.name + " gelen hasarı blokladı!");
           System.out.println("-------------");
           return foe.healt;
       }
        if (foe.healt - this.damage < 0) {
            return 0;
        }
        return foe.healt - this.damage;
    }
    boolean IsDodge()
    {
        Random random = new Random();
        double number = random.nextDouble(0,101);
        return number <= this.dodge;
    }
}
