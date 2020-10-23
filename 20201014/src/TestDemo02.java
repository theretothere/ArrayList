import java.util.Scanner;

public class TestDemo02 {
    public static void main(String[] args) {
        System.out.println("请输入要计算的斐波那契数列的项数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        int ret = fib(n-1)+fib(n-2);
        return ret;
    }
}
