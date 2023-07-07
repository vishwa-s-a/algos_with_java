package edu.face.cat2;

import java.util.Scanner;

public class Euclids {
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers for GCD: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
        System.out.println("The GCD of the two numbers is : "+gcd(a,b));
        }
        else{
            System.out.println("The GCD of the two numbers is : "+gcd(b,a));
        }
        sc.close();
    }
    
}
