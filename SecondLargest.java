import java.util.*;

public class SecondLargest{

    static int findSecondLargest(int a[], int n){

        int max = a[0];
        int secondlarge = -1;

        for(int i = 0; i<n; i++){
            if(a[i] > max){
                secondlarge = max;
                max = a[i];
            }else if(a[i] < max){
                if(a[i] > secondlarge){
                    secondlarge = a[i];
                }
            }
        }
        return secondlarge;
    }
    public static void main(String args[]){
        int a[] = {2, 3, 4, 1, 5, 3, 66, 2, 30};
        int n = a.length;

        int ans = findSecondLargest(a, n);

        System.out.println(ans);
    }
}