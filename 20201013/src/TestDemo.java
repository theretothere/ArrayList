import java.util.Random;
import java.util.Scanner;

/**
 * 这是一部分20201012的课后题答案，其余在project09的TestDemo里边
 */

public class TestDemo {
    public static void main(String[] args) {
        //猜数字游戏
        Random  random = new Random();
        Scanner sc = new Scanner(System.in);
        int rand = random.nextInt(100);
        //[0,100)---->    +1     [1,100]
        while (true){
            System.out.println("请输入你要猜的数字：");
            int n = sc.nextInt();
            if(n < rand){
                System.out.println("猜的数字小了");
            }else if (n > rand){
                System.out.println("猜的数字大了");
            }else{
                System.out.println("你猜对了");
                break;
            }
        }
    }
    public static void main8(String[] args) {
        int n = 123;
        while(n != 0){
            System.out.println(n%10);
            n /= 10;
        }
    }
    public static void main7(String[] args) {
        int n = 7;
        for(int i = 31; i >= 1 ; i-=2){
            //i所对应的位置其实就是偶数的位
            System.out.print(((n >> i)&1)+" ");
        }
        System.out.println();
        System.out.println("===============================");
        for(int i = 30; i >= 0 ; i-=2){
            //i所对应的位置其实就是奇数的位
            System.out.print(((n >> i)&1)+" ");
        }
    }
    public static void main6(String[] args) {
        int n =-1;
        int count = 0;
        while(n != 0){
            count++;
            n = n&(n-1);
        }
        System.out.println(count);
    }

    public static void main5(String[] args) {
        int n =-1;
        int count = 0;
        while(n != 0){
            if((n&1) != 0){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
    public static void main4(String[] args) {
        int count = 0;
        int n = 9;
        for(int i = 0;  i<31 ;i++){
            if((n&1) != 0){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {//自幂数的计算
        /*
        1、需要知道要求的数字是几位数
        2、每一位上的数字是几
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n ; i++){
            int count = 0;
            int tmp = i;
            //求有几位
            while(tmp != 0){
                count++;
                tmp = tmp/10;
            }
            //求i的每一位是多少
            tmp = i;
            int sum = 0;
            while(tmp != 0){
                //3
                sum += Math.pow(tmp % 10 ,count);
                tmp /= 10;
            }
            if(sum == i){
                System.out.println(i+"是自幂数");
            }
        }
    }
    public static void main2(String[] args) {
        int count = 0;
        for(int i = 1; i<=100 ; i++){
            if(i %10 ==9){
                count++;
            }
            if(i /10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= n ; i++) {
            sum += (1.0/i)*flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
}
