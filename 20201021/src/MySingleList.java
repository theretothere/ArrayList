/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-10-20
 * Time: 9:40
 */
class Node {
    public int data;
    public Node next;//存储对象引用
    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}
public class MySingleList {
    public Node head;//作用是，定位头节点的引用
    //头插法
    public void addFirst(int data) {
        //1、通过data构造一个Node对象
        Node node = new Node(data);
        //2、
        if(this.head == null) {
            //第一次插入
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    /**
     * 找到index-1位置的节点
     * @param index
     * @return
     */
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        if(index < 0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    /**
     * 找到关键字Key的前驱
     * @param key
     * @return
     */
    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if(cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        //退出循环，cur已经走到了链表的尾部
        return null;//没有key的前驱
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //1、头节点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2、找需要删除节点的前驱
        Node prev = searchPrevNode(key);
        if(prev == null) {
            return;
        }
        Node del = prev.next;//就是要删除的节点的引用
        prev.next = del.next;
    }


    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.head.next;
        Node prev = this.head;
        while(cur != null){
            if(cur.data != key){
               prev.next = cur.next;
               cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.data == key ){
            head = head.next;
        }
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
    }
    public Node creatList(){
        Node cur = this.head;
        Node newHead = null;
        Node curNext = cur.next;
        while(cur != null){
            Node prev = cur.next;
            if((curNext == null)){
                newHead = cur;
                this.head = newHead;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null&& fast.next != null){//fast.next != null && fast != null
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public Node FindKthToTail (int k ){
        int count = k-1;
        Node fast = this.head;
        Node slow = this.head;
        for(int i = 0 ; i <= count  ; i++){
            
            fast = fast.next;
        }
        if(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
