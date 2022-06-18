import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int [][] arr1=new int[n1][m1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int [][] arr2=new int[n2][m2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        if(m1!=n2){
            System.out.println("Invalid input");
            return;
        }
        int[][] prd=new int[n1][m2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                int val=0;
                for(int k=0;k<m1;k++){
                    val=val+arr1[i][k]*arr2[k][j];
                }
                prd[i][j]=val;
            }
        }
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
