package edu.face.basics;
import java.util.Scanner;

public class Eulersphi {
    public static int euler(int num)
    {
        int result=num;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                while(num%i==0)
                {
                    num/=i;
                }
                result-=result/i;
            }
        }

        if(num>1)
        {
            result -=result/num;
        }

        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int result=euler(num);
        System.out.println(result);
    }
}
