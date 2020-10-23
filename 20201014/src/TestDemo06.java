public class TestDemo06 {
    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(10.2, 10.1));
        System.out.println(max(13.3, 13.3, 13421));
    }
    public static int  max(int x,int y) {
        int tmp = 0;

        if (x > y) {
            tmp = x;
            return tmp;
        }
        else {
            tmp = y;
            return tmp;
        }
    }
    public static double max(double x,double y){
        double tmp = 0.0;
        if(x>y){
            tmp = x;
            return tmp;
        }else{
            tmp = y;
            return tmp;
        }
    }
    public static double max (double x,double y,int z){
        if(x>y && x>z){
            return x;
        }
        if(y>z && y>x){
            return y;
        }else{
            return z;
        }
    }
}
