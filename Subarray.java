import java.util.*;
public class Subarray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for(int si=0;si<arr.length;si++){
            for(int ei=si;si<arr.length;ei++){
                for(int i=si;i<=si;i++){
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }
        }

    }
    
}
