package DataStructure;

public class CircularLinkedList {
    public int data;
    public Node next;
    CircularLinkedList(int data, Node next) {
        this.data = data;
        this.next = next;

//list empty
        Node n = new Node(7,null);
        n.next = n;
//list not empty
        Node tail = null;
        Node q = new Node(8,null);
        q.next = tail.next;
        tail.next.data = n.data;


        int target = 9;
        Node prev = tail;
        Node ptr = tail.next;
        while (ptr!=tail.next) {
            if(ptr.data == target){
                prev.next = ptr.next;
            }
            prev = ptr;
            ptr = ptr.next;
        }




    }



}
