import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        int[] a = {10,12,656,84,62,86};
        maoPao(a);
        System.out.println(Arrays.toString(a));
    }
    public static void maoPao(int[] array) {
        boolean flg = false;//默认没发生交换
        //i是趟数
        for (int i = 0; i < array.length-1; i++) {
            flg = false;//每一趟都有可能没有交换
            //相互比较
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }
}
