/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-10-20
 * Time: 8:34
 */
public class TestDemo {
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null){
            return null;
        }
        int count1 = 0;
        int count2 = 0;
        while(headA != null){
            headA = headA.next;
            count1++;
        }
        while(headB != null){
            headB = headB.next;
            count2++;
        }
        Node pl = headA;
        Node ps = headB;
        int len = count1 - count2;
        if(len < 0){
            pl = headB;
            ps = headA;
            len = count2 - count1;
        }
        for(int i =0 ; i < len ; i++){
            pl = pl.next;
        }
        while(pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        return pl;
    }

    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.display();

        Node ret = mySingleList.findKthToTail(2);
        System.out.println(ret.data);

       /* Node ret = mySingleList.reverseList();
        mySingleList.display2(ret);*/
        /*Node ret2 = mySingleList.middleNode();
        System.out.println(ret2.data);*/
    }
    public static void main1(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(99);
        mySingleList.addLast(99);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addFirst(99);
        mySingleList.display();
        mySingleList.addIndex(5,99);
        mySingleList.display();



        /*mySingleList.clear();
        System.out.println("ffhsakfhsakfhsakfh");*/
      /*  mySingleList.removeAllKey(99);
        mySingleList.display();*/
    }
}
