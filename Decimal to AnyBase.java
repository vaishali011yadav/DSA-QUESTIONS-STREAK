public class Decimal to AnyBase {
    public static void main(Stirng[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int dn=Decimal_AnyBase(n,b);
        System.out.print(dn);
    }
    public static int Decimal_AnyBase(int n,int b){
        while(n!=0){
            int power=0;
            int ans=0;
            int rem=n%10;
            n=n/b;
            ans+=(rem*power)
            power++;
        }
        return ans;

    }
    
}
