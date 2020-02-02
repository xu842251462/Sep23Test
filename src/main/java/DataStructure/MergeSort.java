package DataStructure;

public class MergeSort {
    void sort(int arr[], int l, int r){

        if(l>r){
            return;
        }
        int middle = (l+r)/2;
        sort(arr, l, middle);
        sort(arr, middle+1, r);
        merge(arr, l, middle, r);
    }

    void merge(int arr[], int l, int middle, int r){

        int[]b = new int[middle-l+1];
        for (int i=0; i<=middle; i++) b[i] = arr[i];
        int i = 0, j = middle+1, k = 0;
        while (i <= middle && j <= r) {
            if (arr[j] < b[i]) {arr[k++] = arr[j++];}
            else {arr[k++] = b[i++];}
        }

    }

}
