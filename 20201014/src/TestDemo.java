import java.util.Scanner;

public class TestDemo {
//    public static int sum(int n){
//        if(n == 1){
//            return 1;
//        }
//        n += sum(n-1);
//        return n;
//    }
//    public static void main(String[] args) {
//        int n =10;
//        System.out.println(sum(n));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意数字，计算累计和：");
        int n = sc.nextInt();
        System.out.println(addTen(n));
    }


    public static int addTen(int x){
        if(x == 1){
            return 1;
        }else{
            return x+addTen(x-1);
        }
    }
}
