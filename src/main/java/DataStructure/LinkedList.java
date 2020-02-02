package DataStructure;

import java.util.Collections;
import java.util.Comparator;

public class LinkedList {

    public static void main(String[] args) {
        java.util.LinkedList list = new  java.util.LinkedList();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(7);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Comparator c = Collections.reverseOrder();
        Collections.sort(list, c);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }

}


