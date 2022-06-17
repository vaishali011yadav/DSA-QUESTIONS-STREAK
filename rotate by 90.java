import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        // first take transpose
        for(int i=0;i<arr.elngth;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // reverse columns
        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr.length;
            while(left<=right){
                int temp=arr[i][left];
                arr[i][left]=arr[j][right];
                arr[j][right]=temp;   
                left++;
                right--;
            }
        }
        display();
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }  
    }
}
// compilation error
