public class TestDemo01{
    public static void main(String[] args) {
        InitList l = new InitList(10);
        l.getElem(123);
    }
}

class InitList{

    private int length;              //顺序表长度，表示顺序表中的元素个数

    private int [] list;             //数组，顺序表主体

    public InitList(int max){        //构造函数，用来初始化顺序表时定义顺序表的最大长度
        this.list = new int[max];
        this.length = 0;
    }
    public void clearList() {
            this.length = 0;            //由于是用length属性来表示顺序表中的元素个数，所以清空顺序表只需将length置零即可
    }
    public boolean listEmpty() {
        if(this.length == 0) {         //通过判断length属性是否为零，即可判断顺序表是否为空
            return true;
        }else {
            return false;
        }
    }
    public int listLength() {
        return this.length;         //同上返回length值即可
    }
    public int [] getElem(int site) {

        int [] ret = new int[1];                    //用来存储获取的值

        if(site < 1 || site > this.length) {        //检测输入的位置是否合法
            return null;
        }

        ret[0] = this.list[site - 1];               //获取指定位置的值
        return ret;
    }
    public int locateElem(int value) {

        for (int i = 0; i < this.length; i++) {   //遍历顺序表
            if(this.list[i] == value) {           //逐值比较，如果相同，返回此元素所在位置
                return i + 1;
            }
        }
        return 0;                                 //如未找到，返回零
    }
    public int [] priorElem(int value) {

        int [] ret = new int[this.length];           //定义一个与顺序表同等长度的数组，用来存储找到的直接前驱
        int in = 1;                                  //从数组的第二个位置开始存储找到的直接前驱，第一个空间用来存储找到的直接前驱的个数

        for(int i = 1; i < this.length; i++) {    //遍历顺序表
            if(this.list[i] == value) {         //逐值比较，如果相等，存储其直接前驱到数组中
                ret[in] = this.list[i - 1];
                in++;
            }
        }

        if(in != 1) {        //判断是否找到了直接前驱
            ret[0] = in - 1;     //将直接前驱的个数存入数组中
            return ret;
        }else {
            return null;
        }
    }
    public int [] nextElem(int value) {        //代码逻辑同直接前驱

        int [] ret = new int[this.length];
        int in = 1;

        for(int i = 0; i < this.length - 1; i++) {
            if(this.list[i] == value) {
                ret[in] = this.list[i + 1];
                in++;
            }
        }

        if(in != 1) {
            ret[0] = in - 1;
            return ret;
        }else {
            return null;
        }
    }
    public int listInsert(int site,int value) {

        if(site < 1 || site > this.length + 1) {   //判断输入的位置是否合法
            return -1;
        }else if(this.length == this.list.length) {   //判断顺序表是否已满
            return -2;
        }

        for(int i = this.length - 1; i >= site - 1; i--) {   //从顺序表的最后一个元素开始，逐个向后移动一位，直到要插入元素的位置，为要插入的元素腾出空间
            this.list[i+1] = this.list[i];
        }

        this.list[site - 1] = value;  //插入元素
        this.length++;  //顺序表长度加一
        return 0;
    }
    public boolean listDelete(int site) {
        if(site < 1 || site > this.length) {   //判断输入的位置是否合法
            return false;
        }else if(site == this.length) {        //如果要删除的是最后一个元素，直接将顺序表长度减一即可
            this.length--;
            return true;
        }else {
            for (int i = site - 1; i < this.length; i++) {  //从要删除元素的位置开始，将后面的元素逐个向前移动一位，填补删除元素后的空缺
                this.list[i] = this.list[i + 1];
            }
            this.length--; //顺序表长度减一
            return true;
        }
    }
}