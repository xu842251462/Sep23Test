package DataStructure;

public class SelectionSort {
   void selections(int arr[] ){
       int n= arr.length;
        int minLoc, i , j;
        for(i=0; i<n-1; i++){
            minLoc =i;
            for(j=i+1; j<n;j++){

                //difference between minLoc and arr[minLoc]
                if(arr[j]<arr[minLoc]){
                    minLoc = j;
                }
                int temp = arr[minLoc];
                arr[minLoc] = arr[i];
                arr[i] = temp;
            }
        }



    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr [] = {64,25,12,22,11};
        ob.selections(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }
}
