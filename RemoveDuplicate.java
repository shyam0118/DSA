import java.util.*;

public class RemoveDuplicate{

    static void removeDuplicateSortedArray(int a[], int n){

        int x  = 1;
        for(int i = 1; i<n;i++){
            if(a[x-1] < a[i]){
                a[x++] = a[i];
            }
        }
    }
    public static void main(String args[]){

        int a[] = {1, 1, 1, 3, 4, 4, 4, 6, 6, 7};
        int n = a.length;

        removeDuplicateSortedArray(a, n);

        for(int i = 0; i<n; i++){
            System.out.print(a[i] +" ");
        }
    }
}