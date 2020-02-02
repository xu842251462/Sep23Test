package DataStructure.ProblemSet;

import DataStructure.Node;

public class ProblemSet4<T> {
    private Node<T> front;
    int size;
    public boolean moveTowardFront(int target){

        Node<T> ptr = null, prev=null;
        while (ptr !=null){

            if(ptr.data==target){
                break;

            }else{
                prev = ptr;
                ptr=ptr.next;

            }
        }

        if(ptr == null){
            return false;
        }

        if(prev == null){
            return false;
        }



        int temp = prev.data;
        prev.data = ptr.data;
        ptr.data = temp;
        return true;

    }
}
