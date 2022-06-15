import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BUFFER USED FULL CODE ON NADOS;
        // Scanner scn=new Scanner(System.in);
        // int n=scn.nextInt();
        // int [] arr=new int[n];
        // rotate(arr, k);
    }
    public static void reverse(int []arr,int low,int hi){
        while(low<=hi){
            int temp=arr[low];
            arr[low]=arr[hi];
            arr[hi]=temp;
            low++;
            hi--;
    }
    public static void rotate(int [] arr,int k){
        k=k%10;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr, 0,arr.length-1-k);
        reverse(a,a.length=1-k,arr.length);
        reverse(a,0,arr.length-1);
    }
}