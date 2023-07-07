package edu.face.basics;
import java.util.Scanner;
class Chinese{
    public int calculate(int size, int div[], int rem[])
    {
        int j, x=1;
        while(true)
        {
            for(j=0;j<size;j++)
            {
                if(x%div[j]!=rem[j])
                break;
            }
            if(j==size)
            return x;
            x++;
        }

    }
}
public class ChineseRemainder {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int div[]=new int[size];
        int rem[]=new int[size]; 
        System.out.println("Enter the divisors and remainders");
        for(int i=0;i<size;i++)
        {
            div[i]=sc.nextInt();
            rem[i]=sc.nextInt();
        }
        Chinese c=new Chinese();
        System.out.println(c.calculate(size, div, rem));


    }
    
}
