import java.util.*;
public class print state of wakanda-1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;<arr.length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int j=0;j<m;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                    arr[i][j]=scn.nextInt();
                }
            }
            else{
                for(int i=n-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }  
}
// doubt