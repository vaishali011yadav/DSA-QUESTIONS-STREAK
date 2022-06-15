public class BinarySearch {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        int data=scn.nextInt();
        int h=0;
        int l=arr.length-1;
        int foundat=-1;
        while(l<=h){

            int mid=l+h/2;
            if(data>mid){
                l=mid+1;
            }
            else if(data<arr[mid]){
                h=mid-1;
            }
            else{
                foundat=mid;
                break;
            }
        }
    }   
}
// CODE IS NOT WORKING
