import java.util.Scanner;

import java.util.Scanner;
import java.util.Arrays;
public class array9
 {
    public static void main(String args[]) {
        Scanner aki = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int a = aki.nextInt();
        System.out.println("Enter the Elements:");
        int input[] = new int[a];
        for (int i = 0; i < a; i++) {
            input[i] = aki.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(input));          //Insert element Position given by user 
        System.out.println("Enter the index:");
        int b=aki.nextInt();
        System.out.println("Enter the value:");
        int c=aki.nextInt();
        for(int i=input.length-1;i<b;i--) {

            input[i] = input[i - 1];}
        input[b]=c;
        System.out.println("After Insert "+Arrays.toString(input));
    }
}
