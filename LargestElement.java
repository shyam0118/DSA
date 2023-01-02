import java.util.*;

public class LargestElement{

    static int findLargest(int a[], int n){

        int max = a[0];

        for(int i = 0; i<n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String args[]){

        int a[] = {1, 2, 3, 5, 3,  6, 2, 7, 1, 2};
        int n  = a.length;

        int ans = findLargest(a, n);

        System.out.println(ans);
    }
}