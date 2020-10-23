public class TestDemo07 {
    public static void main(String[] args) {
        System.out.println(add(10, 23));
        System.out.println(add(10.2, 23.2));
    }
    public static int add(int x,int y){
        int sum = x+y;
        return sum;
    }
    public static double add(double x,double y){
        double sum = x+y;
        return sum;
    }
}
