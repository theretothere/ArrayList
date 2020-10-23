class Nodes{
    public int data;
    public Nodes next=null;
    public Nodes(int data){
        this.data=data;
    }
}
public class TestDemo02 {
    private Nodes head=null;
    public void addFirst(int data){
        Nodes nodes=new Nodes(data);
        if(head==null){
            head=nodes;
            return;
        }
        nodes.next=head;
        head=nodes;
    }
    public void addLast(int data){
        Nodes nodes=new Nodes(data);
        if(head==null){
            head=nodes;
            return;
        }
        Nodes tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        tail.next=nodes;
    }
    public void display(){
        for(Nodes cur=head;cur.next!=null;cur=cur.next) {
            System.out.println(cur.data + " ");
        }
    }
    public int getSize(){
        int size=0;
        for(Nodes cur=head;cur.next!=null;cur=cur.next){
            size++;
        }
        return  size;
    }
    private Nodes getPos(int index){
        Nodes cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    public boolean addIndex(int index,int data){
        int size=getSize();
        if(index<0||index>size){
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        if(index==size){
            addLast(data);
            return true;
        }
        Nodes nodes=new Nodes(data);
        Nodes pre=getPos(index-1);
        nodes.next=pre.next;
        pre.next=nodes;
        return true;
    }
    public boolean contains(int toFind){
        for(Nodes cur=head;cur.next!=null;cur=cur.next){
            if(cur.data==toFind){
                return true;
            }
        }
        return false;
    }
    public void remove(int toRemove){
        if(head.data==toRemove){
            head=head.next;
            return;
        }
        Nodes prev=searchPrev(toRemove);
        Nodes toData=prev.next;
        prev.next=toData.next;
    }
    private    Nodes searchPrev(int toRemove){
        for(Nodes cur=head;cur!=null&&cur.next!=null;cur=cur.next){
            if(cur.next.data==toRemove){
                return cur;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TestDemo02 linkList = new TestDemo02();
        linkList.addFirst(1);
        linkList.addFirst(2);
        linkList.addFirst(3);
        linkList.addFirst(4);
        linkList.display();
    }
}