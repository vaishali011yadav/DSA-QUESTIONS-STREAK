import java.util.*;
public class digit frequency {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int digitFrequency=digit_frequency(n,d);
        System.out.print(digitFrequency);
    }
    public static  int digit_Frequency(int n,int d){
        int count=0;
        while(n>0){
            remainder=n%10;
            if(remainder==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    
}
