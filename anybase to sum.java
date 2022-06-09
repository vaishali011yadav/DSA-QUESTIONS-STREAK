import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();
        int sum= main(b,n1,n2);
        System.out.print(sum);
    }
    public static int  main( int b,int n1,int n2){
        int power=1;
        int carry=0;
        int ans=0;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int sum=d1+d2+carry;
            int rem=sum%b;
            int quot=sum/b;
            ans+=rem*power;
            carry=quot;
            power*=10;
        }
        return ans ;
    }

    
}
// wrong output
