package DataStructure;

import java.util.Set;

public class HashSet {
    private String first;
    private String last;

    public HashSet(String first, String last){
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o){
        if(this.equals(o)){
            return  true;
        }
        if(o.getClass()== HashSet.class){
            HashSet n = (HashSet) o;
            return n.first.equals(first)&& n.last.equals(last);
        }
        return false;
    }

    public int hashCode(){
        return first.hashCode();
    }


    @Override
    public String toString(){
        return first+"+"+last;
    }

}

class HashSetTest{
    public static void main(String[] args) {
        Set<HashSet> s = new java.util.HashSet<HashSet>();
        s.add(new HashSet("abc", "bcd"));
        s.add(new HashSet("abc", "bcd"));
        /*Set<HashSet> s1 = new java.util.HashSet<HashSet>();
        s1.add(new HashSet("abb", "bcd"));*/
        System.out.println(s);
    }
}
