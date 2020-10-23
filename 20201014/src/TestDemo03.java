import java.util.Scanner;

public class TestDemo03 {
    public static void main(String[] args) {
        System.out.println("输入你要打印的数字：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
    public static void printNum(int n) {
        if(n <= 9) {
            System.out.print(n);
            return;
        }
        printNum(n/10);
        System.out.print(n%10);
    }
}
