import java.util.*;
public class print fibconacci {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a);
            int c=scn.nextInt();
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
    
}
