/**
 * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
 */
public class TestDemo06 {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,5,5,6,7,7};
        System.out.println(foundNumber(a));
    }
    public static int foundNumber(int[] x){
        int result=0;
        for(int i=0;i<x.length;i++){
            result^=x[i];
        }
        return result;
    }
}

