public class HomeWork04 {
    public static void main(String[] args) {
        int[] array = {10,16,45,1,51,2,3};
        int[] a = copyOf(array);
        System.out.println(a);
    }
    public static int[] copyOf(int[] array){
        int[] tmp = new int[10];
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        return tmp;
    }
}
