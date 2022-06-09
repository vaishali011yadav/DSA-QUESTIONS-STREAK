public class Binary to decimal{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int bd=Binary_Todecimal(n,b);
        System.out.print(bd);
    }
    public static int Binary_Todecimal(int n,int b){
        int power=1;
        int ans=0;
        while(n>0){
            int remainder=n%10;
            n=n/10;
            ans+=(remainder*power);
            power=power*b;
        }
        return ans;
    }
    
}
