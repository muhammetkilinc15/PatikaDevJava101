public class Main {
    public static void main(String[] args) {
        // Harmonik ortalamasını hesaplayan program
        // Formül : n(eleman sayısı) / elemanların harmonik serisi
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int total;
        for (int i = 1; i < numbers.length; i++) {

            sum += 1 / i ;
        }
        System.out.println("n(eleman sayısı) ==> " + numbers.length);
        System.out.println("m(Harmonik seri) ==> " + sum);
        total = numbers.length / sum ;

        System.out.println("Harmonik avarage  n / m ==> "  + total);




    }
}