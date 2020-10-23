public class Test4 {
    public static void main(String[] args) {
        int[] a = {10,23,5312,43,24,13};
        findNumber(a);
    }
    public static void findNumber(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            //left遇到奇数了
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            //right 遇到偶数了
            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
}
