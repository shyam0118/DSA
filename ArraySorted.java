import java.util.*;

public class ArraySorted{

    static boolean checkSortedOrNot(int a[], int n){

        for(int i = 0; i<n-1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        boolean ans = checkSortedOrNot(a, n);

        System.out.println(ans);
    }
}