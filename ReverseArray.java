import java.util.*;

public class ReverseArray{

    static void reverse(int a[], int n){
        int i = 0;
        int j = n-1;

        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }  
    }
    public static void main(String args[]){

        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        reverse(a, n);

        for(int e : a){
            System.out.print(e + " ");
        }
    }
}
