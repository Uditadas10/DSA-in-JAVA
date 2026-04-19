/*
PROBLEM: find the largest element of array
APPROACH:

1.Initialize max=a[0]
2.for i->1 to n
3.check if a[i]>max then
4. update max=a[i]


Time complexity: O(n)
Space complexity: O(1)
*/

import java.util.*;

public class LargestElement {
    public static void main(String args[]){
        int arr[]={8,5,3,9,2,0};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    System.out.println(max);
    }

}
