package DataStructure;

public class ArrayList {

    private  Object[] elementData;
    private  int size;

    public  ArrayList(){
    }

    public  ArrayList(int initialCapacity){
        if(initialCapacity <0){
            try{
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public int getSize(){
        return  size;
    }

    public  Object get(int index){
        rangeCheck(index);
        return elementData[index];

    }
    private void  rangeCheck(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    public  void remove(int index){
        rangeCheck(index);
        int numMoved = size-index-1;
        if(numMoved>0){
            System.arraycopy(elementData, index+1, elementData,index,numMoved);
            elementData[--size]=null;
        }
    }
    public void remove (Object o){
        for(int i = 0; i<size; i++){
            if(get(i).equals(o)){
                remove(i);
            }
        }
    }

    public Object set (int index, Object obj){
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }

    private void add(Object obj) {
        if(size == elementData.length){
            Object[] newElementData = new Object[(size*2)+1];
            System.arraycopy(elementData, 0, newElementData,0,elementData.length);
            elementData = newElementData;
        }
        elementData[size++] = obj;
    }


    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);
        list.add("aaa");
        list.add("aba");
        list.add("aab");
        list.add("aca");
        list.add("aac");
        list.add("ada");

        System.out.println(list.get(1));
        list.set(1,"www");
        System.out.println(list.get(1));
        System.out.println(list.getSize());
    }



}
