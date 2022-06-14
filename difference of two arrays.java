import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        // used just to print in a array form
        System.out.print("[ ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
                // used just to print in a array form
        System.out.print("]");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int[] diff = new int[n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int carry = 0;
        while (k >= 0) {
            int ans = arr2[j] + carry;
            if (i >= 0) {
                ans = ans - arr1[i];
            }
            if (ans < 0) {
                ans = ans + 10;
                carry = -1;
            } else {
                carry = 0;
            }
            diff[k] = ans;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < diff.length) {
            if (diff[index] != 0) {
                break;
            } else {
                index++;
            }
        }
        while (index < diff.length) {
            System.out.println(diff[index]);
            index++;
        }

    }
}
