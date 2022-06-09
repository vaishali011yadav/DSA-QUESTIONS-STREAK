import java.util.*;
public class anybase subtraction {
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);
        int b=scn.nextInt();
        int n2=scn.nextInt();
        int n1=scn.nextInt();
        int sub=getSub(b,n1,n2);
        System.out.print(sub);
    }
    public static int getSub(int b,int n1,int n2){
        int power=1;
        int ans=0;
        int carry=0;
        while(n2>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
           if(sum<0){
               carry=-1;
               sum=sum+b;
           }
           else{
               sum=sum;
               carry=0;
           }
           ans+=(sum*power);
           power*=10;

        }
        return ans;
    }
    
}
