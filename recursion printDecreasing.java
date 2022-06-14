import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    // Expectation => pd(n) = n n-1 n-2 ... 3 2 1
    // Faith => pd(n-1) = n-1 n-2 n-3 ... 3 2 1
    // E weds faith => pd(n) = n pd(n-1)
    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        printDecreasing(n - 1);
    }

}
