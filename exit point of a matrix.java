import java.util.*;
public class exit point of a matrix {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int [][] arr=new int[r][c]
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int i=0;
        int j=0;
        int direction=0;
        while(true){
            direction=(direction+arr[i][j]) %4;
            if(dir==0){
                j++;
                if(arr[0].length){
                    j--;
                    break;
                }
            }
            else if(direction==1){
                i++;
                if(arr.length){
                    i--;
                    break;
                }
            }
            else if(direction==2){
                j--;
                if(j==-1){
                    j++;
                    break;
                }
            }
            else{
                i--;
                if(i==-1){
                    i++;
                    break;
                }
            }
        }
        System.out.println(arr[i]);
        System.out.println(arr[j]);
    }
    
}
// code didnt run
