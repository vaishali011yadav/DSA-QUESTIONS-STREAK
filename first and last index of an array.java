import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        int left=0;
        int right=arr.length;
        int find=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(data>arr[mid]){
                left=mid+1;
            }
            else if(data<arr[mid]){
                right=mid-1;
            }
            else{
                find=mid;
                right=mid-1;
            }
        }
        System.out.println(find+"first index");
        int left2=0;
        int right2=arr.length;
        int find2=-1;
        while(left<=right){
            int mid=(left2+right2)/2;
            if(data>arr[mid]){
                left=mid+1;
            }
            else if(data<arr[mid]){
                right=mid-1;
            }