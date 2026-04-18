/*
Problem: Reverse an Array

Approach:
Swap the first and last elements and move toward the center.

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
       int arr[]={3,7,1,9,2,0};
       int n=arr.length;
       
       for(int i=0; i<n/2; i++){
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
       }

       for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
       }
    }
}