package edu.face.cat2;
import java.util.Scanner;
public class Booth {
    public static int multiply(int n1,int n2){
        int r=n2;
        int A=n1;
        int p=0;
        int count=Integer.SIZE;
        while(count>0){
            if((r&1)==1)
            {
                p+=A;
            }
            A<<=1;
            count--;
            r>>=1;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=multiply(n1, n2);
        System.out.println("The product of two numbers is: "+result);
        sc.close();
    }
    
}
