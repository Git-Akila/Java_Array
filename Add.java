import java.util.Scanner;
public class array3 {
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=aki.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=aki.nextInt();
        }
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                if(array[i]+array[j]== a && i!=j)
                {System.out.println(i+", "+j);
                }
            }
        }
    }
}
