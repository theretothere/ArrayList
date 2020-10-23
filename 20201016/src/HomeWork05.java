public class HomeWork05 {
    public static void main(String[] args) {
        int[] array = {10,45,65,132};
        System.out.println(toString(array));
    }
    public static String toString(int[] array){
        String tmp = "[";
        for (int i = 0; i < array.length; i++) {
            tmp = tmp + array[i];//[ 1,
            //当时最后一个元素的时候，不加,
            if(i != array.length-1) {
                tmp += ", ";
            }
        }
        tmp += " ]";
        return tmp;
    }
}
