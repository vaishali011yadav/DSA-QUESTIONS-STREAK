import java.util.*;

public class reverseArray {
    public static void main(String[] args){
    }
}

    public static void Revere(int [] arr){
        int right=arr.length-1;
        int left=0;
        while(left<right){
            int temp=right;
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }  
    } 
}
