package DataStructure;

public class DoubleLinkedList {
    int data;
    Node prev;
    Node next;
    public  DoubleLinkedList(int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;

        Node ptr = null;

        Node n = new Node(8,null);
        ptr.next =n;
        n.next.prev= n;


        int target=0;
        while(ptr!=null){
            if(ptr.data == target){
                ptr.prev.next = ptr.next;
                ptr.next.prev = ptr.prev;
            }
            prev = ptr;
            ptr=ptr.next;
        }

    }





}
