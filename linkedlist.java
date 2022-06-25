public class linkedlist {
    private void node(Node node){
        Node node;
        int size;
    }
    public static class linkedlist(int val){
        Node head;
        Node tail;
        int size;
    }
    int size(){
        return size;
    }
    void display(){
        if(size==0){
            return;
        }
        for(Node temp=this.head;temp!=0;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
    void AddLast(int val){
        Node node=new node();
        if(size==0){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public int GetFirst(){
        if(size==0){
            System.out.print("list is empty");
            return -1;
        }
        else{
            return head.data;
        }
    }
    public int GetLast(){
        if(size==0){
            return -1;
        }
        else{
            return tail.data;
        }
    }
    public int getAt(int idx){
        if(size==0){
            System.out.println("empty list")
        }
        else if(idx<size || idx>size){
            System.out.println("invalid input");
        }
        else{
            node temp=head;
            for(int i=0;i<idx;idx++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public void RemoveFirst(){
        if(size==0){
            System.out.println("empty");
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            head=head.next;
            size--;
        }
    }
    public void addAt(int idx, int val){
        // write your code here
        if(idx == 0){
            addFirst(val);
        } else if(idx == size){
            addLast(val);
        } else if(idx < 0 || idx > size){
            System.out.println("Invalid arguments");
        } else {
            Node nm1 = head;
            for(int i = 0; i < idx - 1; i++){
                nm1 = nm1.next;
            }
            // np1=previous
            Node np1 = nm1.next;
            Node node = new Node();
            node.data = val;
            node.next = np1;
            nm1.next = node;
            size++;
        }
    }
    public void RemoveLast(){
        if(size==0){
            System.out.println("empty list");
        }
        else if(size==1){
            tail=head=null;
            size=0;
        }
        else{
            node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
            size--;
        }
    }
    public void RemoveAt(int idx){
        node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
