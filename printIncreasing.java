
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    // Expectation => pi(n) = 1 2 3 ... n-2 n-1 n
    // Faith => pi(n-1) = 1 2 3 .... n-3 n-2 n-1
    // EwF => pi(n) = pi(n-1) n
    public static void printIncreasing(int n){
        if(n == 0){
            return;
        }
        
        printIncreasing(n - 1);
        System.out.println(n);
    }

}
