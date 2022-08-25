public class Main {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={1,2,2,3,4,5,12,12,3,4,5,5,6,7,8,17,56,71,13};
        int[] dublicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i< list.length;i++){

            for (int j=0;j< list.length;j++){
                if ((i!=j)&&(list[i]==list[j])){
                    if (!isFind(dublicate,list[i])){
                        dublicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }

        System.out.println("\nRepeat even number(çift):");
        for (int value:dublicate){
            if ((value != 0)&&(value %2 ==0)){
                System.out.println(value);
            }
        }

        System.out.println("\nRepeat odd number(tek):");
        for (int value:dublicate){
            if ((value!=0)&&(value%2!=0)){
                System.out.println(value);
            }
        }
    }
}