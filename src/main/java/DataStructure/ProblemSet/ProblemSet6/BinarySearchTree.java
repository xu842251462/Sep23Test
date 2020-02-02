package DataStructure.ProblemSet.ProblemSet6;

import java.util.ArrayList;

public class BinarySearchTree <T extends Comparable<T>>{

    T data;
    BinarySearchTree<T> left,right;
    public  BinarySearchTree (T data){

        this.data= data;
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return data.toString();
    }


    public static <T extends Comparable<T>>void
    keysInRange( BinarySearchTree<T> root, T min, T max, ArrayList<T> result) {
        if(root == null){
            return;
        }

        int a1 = min.compareTo(root.data);
        int a2 = root.data.compareTo(max);

        if(a1<=0 &&a2<=0){

            result.add(root.data);

        }

        if(a1<0){
            keysInRange(root.left, min, max,result);
        }

        if(a2<0){
            keysInRange(root.right, min, max,result);
        }




        /* COMPLETE THIS METHOD */ }
}
