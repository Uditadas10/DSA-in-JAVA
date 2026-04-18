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
