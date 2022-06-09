import java.util.*;
public class isprime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t =scn.nextInt();
        for(int i=1;i<=t;i++){
            int n=scn.nextInt();
            boolean isprime=true;
            for(int j=2;j*j<=n;j++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime==true){
                System.out.print("prime");
            }
            else{
                System.out.print("not prime");
            }
        }

    }
}
