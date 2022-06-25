import org.w3c.dom.Node;

public class linkedlistQuestions {
    private void node(Node node){
        Node next;
        int size;
    }
    public void linkedlist(){
        Node head;
        Node tail;
        int size;
    }
    int size(){
        return size;
    }
    void display(){
        for(node temp=node.next;temp!=0;temp=temp.next){
            System.out.println(temp.data);
        }
    }
    // kth element 
    public int KthElement(int k){
        Node fast=head;
        Node slow=tail;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    // mid of linkedlist
    public int MidOf(){
        fast=head;
        slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
    // reverse ll data
    public node  GetNodeAt(int indx){
        node temp=node.next;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void reverse(){
        int left=0;
        int right=size-1;
        while(li<ri){
            Node left=GetNodeAt(left);
            node right=GetNodeAt(right);

            int temp=left.data;
            left.data=right.data;
            right.data=temp;
            left++;
            right--;
        }
    }
    // reverse pointer
    public void ReverseAddres(){
        Node prev=null;
        Node current=head;
        while(current!=0){
           Node next=current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        node temp=head;
        head=tail;
        tail=temp;
    }
    // merge two sorted linkedlist
    public void AddLast(){
        Node temp=new node();
        temp.data=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
        }
        else{
            temp.next=temp;
            tail=temp;
        }
        size++;
    }
    public void MergeTwoSorted(linkedlist l1,linkedlist l2){
        linkedlist res=new linkedlist();
        node one=l1.head;
        node two=l2.head;
        while(one!=0 && two!=0){
            if(one.data>two.data){
                res.AddLast(one.data);
                one=one.next;
            }
            else{
                res.AddLast(two.data);
                two=two.next;
            }
        }
        if(one==null){
            while(two!=null){
                res.AddLast(two.data);
                two=two.next;
            }
        }
        else if(two==null){
            while(one!=null){
                res.AddLast(one.data);
                one=one.next;
            }
        }
        return res;
    }
}
