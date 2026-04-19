import java.util.*;

public class SortedArray {
    public static void main(String args[]){
        boolean sorted =true;
        int arr[]={6,4,8,1,9,2};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
            }
        }
        if(sorted){
            System.out.print("the array is sorted");
        }
        else{
            System.out.print("the array is not sorted");
        }
    }
}
