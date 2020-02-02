package DataStructure;

public class Node<T> {
    public int data;
    public Node next;
    public Node prev;

    Node(int data, Node next){
        this.data = data;
        this.next = next;


        Node L = null;
        Node f = new Node(6, null);
        L = f;
        Node s = new Node(6, null);
        f.next = s;
        Node t = new Node(8, null);
        s.next = t;




        Node ptr = L;
        if(ptr != null){
            ptr = ptr.next;

        }
        //find target in the LL;
        int target = 0;
        while(ptr != null){
            if (ptr.data == target){
                break;
            }
            ptr = ptr.next;
        }


        //insert the data after the target
        if(ptr!=null){
            Node q = new Node(10,null);
            q.next = ptr.next;
            ptr.next = q;

        }

        if(ptr != null){
            Node r = new Node(9,null);
            r.next = ptr.next;
            ptr.next = r;

        }

        L = L.next;


        int target1 = 0;
        while (ptr!=null){
            if(ptr.data == target1){
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }


        Node prev = null;
        while(ptr!=null&&ptr.data!=target1){

            prev = ptr;
            ptr = ptr.next;
        }
        if(ptr.data==target){
            prev.next = ptr.next;
        }


    }






}
