package DataStructure;

public class InsertionSort {

    void insertionSort(int[]a, int n){

        for(int i =1; i<n; i++){

            int insetTerm = a[i];
            int loc = i-1;

            while(loc>=0){
                if(a[loc]>insetTerm){
                    a[loc+1]=a[loc];
                    loc--;
                }else{
                    break;
                }
            }

            a[loc+1]=insetTerm;
        }

    }

    void printArray(int a[]){
        for(int i =0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int arr [] = {64,25,12,22,11};
        ob.insertionSort(arr,arr.length);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }

}
