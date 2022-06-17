
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int count = 1;
        int total = n * m;

        while(count <= total){
            for(int i = minr, j = minc; i <= maxr && count <= total; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            for(int i = maxr, j = minc; j <= maxc && count <= total; j++){
                System.out.println(arr[i][j]);
                 count++;
            }
            maxr--;

            for(int i = maxr, j = maxc; i >= minr && count <= total; i--){
                System.out.println(arr[i][j]);
                 count++;
            }
            maxc--;
            
            for(int i = minr, j = maxc; j >= minc && count <= total; j--){
                System.out.println(arr[i][j]);
                 count++;
            }
            minr++;
        }
    }
}
// time limit exceed
// done chek notes if any error you find while writtig the code
