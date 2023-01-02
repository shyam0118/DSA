import java.util.*;

public class DeleteElement{

    static void  delete(int a[], int n, int x){

        int delete = -1;
        for(int i = 0; i<n; i++){
            if(a[i] == x){
                delete = i;
            }
        }
        for(int i = delete; i<n-1; i++){
            a[i] = a[i+1];
        }
    }
    public static void main(String args[]){

        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        int x  = 4;

        delete(a, n, x);

        for(int i : a){
            System.out.print(i+ " ");
        }


    }
}