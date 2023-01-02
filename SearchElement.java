import java.util.*;

public class SearchElement{
    public static void main(String args[]){
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        int key = 4;

        for(int i = 0; i<n; i++){
            if(a[i] == key){
                System.out.println(key + " is found at index "+ i);
            }
        }
    }
}