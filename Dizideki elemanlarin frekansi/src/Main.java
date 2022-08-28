public class Main {
    public static void main(String[] args) {
        // Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program!

        int [] list =  { 10,20,30,40,10,50};
        int [] frekans = new int[list.length];

        for (int i = 0 ; i < list.length ; i++){
            frekans[i] = 1;
        }

        for (int i = 0 ; i < list.length ; i++){
            for (int j =0; j < list.length;j++){
                if (i !=j && list[i] == frekans[i]){
                    frekans[i]++;
                }
            }
        }
        for (int i =0;i < list.length;i++){
            for (int j = 0 ; j < list.length; j++){
                if (i != j && list[i] == frekans[i]){
                    list[i]=0;
                }
            }
        }
        for (int i =0; i < list.length;i++){
            if (frekans[i] >= 1){
                if (list[i] != 0){
                    System.out.println("The number " + list[i] + " is repeated" + frekans[i] + " times.");
                }
            }
        }



    }
}
