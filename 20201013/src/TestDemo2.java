public class TestDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //int c = maxTwoNumber(a,b);//调用
        //System.out.println(c);
        int d = maxThreeNumber(10,20,30);
        System.out.println(d);
    }
    public static int maxTwoNumber(int a,int b){
        if(a > b){
            //System.out.println(a);
            return a;
        }else{
            //System.out.println(b);
            return b;
        }
    }
    public static int maxThreeNumber(int a,int b,int c){
        int max2 = maxTwoNumber(a,b);
        int max3 = maxTwoNumber(max2,c);
        return max3;
    }
}
