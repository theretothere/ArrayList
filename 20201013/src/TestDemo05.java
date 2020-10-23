import java.util.Scanner;

/**
 * 求斐波那契数列的第n项。(迭代实现)
 */
public class TestDemo05 {
    public static void main(String[] args) {
        int a = 1;//数组中的第一个
        int b = 1;//数组中的第二个
        System.out.println("请输入需要运算的项数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];//创建数组
        for(int i = 2; i <= arr.length ; i++){
            arr[0] = a;
            arr[1] = b;
            while(i <= n){//当小于要求的n时进入循环
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.println(arr[i]);
        }
    }

}
