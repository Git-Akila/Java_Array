import java.util.Arrays;
import java.util.Scanner;

public class Desending{
  public static void main(String args[])
{
    Scanner aki=new Scanner(System.in);
    System.out.println("Enter the limit:");
    int a=aki.nextInt();
    System.out.println("Enter the Elements:");
    int input[]=new int[a];

    for(int i=0 ;i<a;i++)
    {
        input[i]=aki.nextInt();
    }int b;
    for(int i=0;i<a;i++)
    {
        for(int j=i+1;j<a;j++)
        {
            if(input[i]<input[j]){
                b=input[i];
                input[i]=input[j];
                input[j]=b;
            }
        }}

    System.out.println("Array:"+ Arrays.toString(input));


    System.out.println("Smallest:"+input[0]);
    for(int i=0;i<a;i++)
    {
        for(int j=i+1;j<a;j++)
        {
            if(input[i]<input[j]){
                b=input[i];
                input[i]=input[j];
                input[j]=b;
            }
        }}System.out.println("Array:"+ Arrays.toString(input));
    System.out.println("largest:"+input[0]);



}}
