import java.util.Scanner;

public class TestDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意数字，计算各位的累计和：");
        int n = sc.nextInt();
        System.out.println(addNumber(n));
    }


    public static int addNumber(int n) {
        if(n < 10) {
            return n;
        }
        return sum(n/10)+n%10;
    }
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        //return n+sum(n-1);
        int ret = n+sum(n-1);
        return ret;
    }
}
