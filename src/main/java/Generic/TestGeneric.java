package Generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestGeneric {


   /* public static void main(String[] args) {
        *//*ArrayList<Number> a = new ArrayList<>();
        a.add(123);
        a.add(12.3d);
        a.add(123f);*//*




    }*/
   public static void main(String[] args) {
       List<LinkedList> o1 = new List<>();
       List<ArrayList> o2=new List<>();
   }

}

class List<T extends java.util.List>{
   private T[] fooArray;



   public T[] getFooArray() {
      return fooArray;
   }



}
