public class TestDemo01 {
    public static void main(String[] args) {//汉诺塔问题
        System.out.println(addSum(1999));
        hanoiTower(1,'A','B','C');
        System.out.println();
        hanoiTower(2,'A','B','C');
        System.out.println();
        hanoiTower(3,'A','B','C');
    }

    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoiTower(int n,char pos1,char pos2,char pos3){
        if(n == 1){
            move(pos1,pos3);
            return ;
        }
        hanoiTower(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoiTower(n-1,pos2,pos1,pos3);
    }
    public static int addSum(int n){
        if(n <=- 1){
            System.out.println("输入数字错误!");
        }
        if(n>9) {
            return n % 10 + addSum(n / 10);
        }
        return n;
    }
}
