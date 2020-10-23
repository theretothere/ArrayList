public class HomeWork02 {
    public static void main(String[] args) {
        int[] array = {10,9,54,24,25};
        System.out.println(sort(array));
    }
    public static boolean sort(int[] array){
        for(int i = 0; i < array.length-1 ; i++){
            while(array[i] >= array[i+1]){
                return false;
            }
        }
        return true;
    }
}
