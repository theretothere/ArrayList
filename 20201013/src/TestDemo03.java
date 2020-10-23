public class TestDemo03 {
    public static void main(String[] args) {
        System.out.println(sumFunc(5));
    }
    public static int func(int x){
        //求阶乘
        int num = 1;
        for(int i = 1; i <= x ; i++){
            num *= i;
        }
        return num;
    }
    public static int sumFunc(int x){
        //阶乘的和
        int sum =0;
        for(int i = 1; i <= x ; i++){
            int c = func(i);
            sum += c;
        }
        return sum;
    }
}
