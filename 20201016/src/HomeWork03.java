public class HomeWork03 {
    public static void main(String[] args) {
        int[] array = {10,26,85,46,56,123,54};
        int ret = erFenChaZhao(array,95);
        System.out.println(ret);
    }
    static int count = 0;
    public static int erFenChaZhao(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            count++;
            int mid = (left+right)/2;
            if(array[mid] < key) {
                left = mid+1;
            }else if(array[mid]  > key) {
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;//没有找到
    }
}
