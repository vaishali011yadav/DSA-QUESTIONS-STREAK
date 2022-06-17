import java.util.*;
public class broken economy {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        int left=0;
        int right=arr.length;
        int floor=-1;
        int ceil=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>data){
                left=mid+1;
                floor=arr[mid];
            }
            else if(arr[mid]<data){
                right=mid-1;
                ceil=arr[mid];
            }
            else{
                floor=arr[mid];
                ceil=arr[mid];
            }
        }
        System.out.println(floor);
        System.out.print(ceil);
    }  
}
