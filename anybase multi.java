public class anybase multi {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int multi=getproduct(b, n1, n2);
        System.out.print(multi);
    }
    public static int getproduct(int b,int n1,int n2){
        int ans=0;
        int power=1;
        while(n2>0){
            int d2=d2%10;
            d2=d2/10;
            int productSingleDigit=Multi_With_Singledigit(b,n1,n2)
            ans=Sum(b,ans,productSingleDigit*power);
            power*=10;
        }
    }
    public static int Multi_With_Singledigit(int b,int n1,int d){
        int carry=0;
        int power=1;
        int ans=0;
        while(n1!=0 || carry !=0){
            int d1=n1%10;
            d1=d1/10;
            int product=ld1*d+carry;
            int rem=product%b;
            int quot=product/;
            ans+=(rem*power);
            power=power*10;
            carry=quot;
        }
        return ans;
    }
    public static int Sum(int m1,int m2, int d2,int b){
        int power=1;
        int carry=0;
        int ans=0;
        while(m1>0 || m2>0 || carry>0){
            int d1=n1%10;
            int d2=n2%10;
            m1=m1/10;
            m2=m2/10;
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
// code didnt run
