import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int span=max-min;
        System.out.print(span);
    }
}

