import java.util.Scanner;

/**
 * 青蛙跳台阶
 *  台阶数   跳法
 *  1         1
 *  2         2
 *  那么青蛙在调上最后的台阶时，一定会经过（n-1）和（n-2）中的一个
 */
public class TestDemo08 {
    public static void main(String[] args) {
        System.out.println(fogJump(3));
        System.out.println(humanJump(4));
    }
    public static int fogJump(int n){//形参表示台阶数
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        return fogJump(n-1)+fogJump(n-2);
    }
    public static int humanJump(int n){//这次是疯子跳台阶，不限制台阶的数量，
        // 求最后到最顶端的方式有多少种
        //台阶数    方法数
        //1         1
        //2         2
        //3         4
        //4         8 产生类似于2^(n-1)的关系
        //可以选择一次一阶，到一次全部跳上去
        int tmp =(int) Math.pow(2,(n-1));
        return tmp;
    }
}
