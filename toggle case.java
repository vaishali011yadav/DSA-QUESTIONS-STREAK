import java.io.*;
import java.util.*;
public class Main {
    public static String toggleCase( String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch>='A' && ch<='Z'){
                char lower_Case=(char)(ch+('a'-'A'));
                sb.setCharAt(i,lower_Case);
            }
            else{
                char Upper_Case=(char)(ch+('A'-'a'));
                sb.setCharAt(i,Upper_Case);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(toggleCase(str));
    }
    
}
