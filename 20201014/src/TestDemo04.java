import java.util.Scanner;
/**
 * 采用递归的方式来计算阶乘
 */
public class TestDemo04 {
    public static void main(String[] args) {
        System.out.println("输入需要递归求阶乘的数字：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        int tmp = n * fac(n-1);
        return tmp;
    }
}
