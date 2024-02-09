import java.util.Scanner;
import java.util.Arrays;
public class array2 {
    public static void main(String args[])
    {Scanner aki=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=aki.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the Element:");
        for(int i=0;i<n;i++)
        {
            array[i]=aki.nextInt();
        }
        int j;
        for(int i=0;i<array.length;i++)
        {
            for(j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.println("Duplicate:"+array[i]);
                }
            }
        }


    }
}
