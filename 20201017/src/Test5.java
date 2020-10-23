public class Test5 {
    public static void main(String[] args) {
        int[] a = {10,23,32,23};
        System.out.println(copy(a));
    }
    public static int[] copy(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        //tmp当中 存放的就是拷贝后的数据
        for (int i = 0; i < tmp.length ; i++) {
            tmp[i] = tmp[i]*2;
        }
        return tmp;
    }

}
