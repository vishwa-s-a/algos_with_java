package edu.face.cat2;

import java.util.Scanner;
import java.lang.Math;

public class Karatsuba {
    public static long karatsuba(long x,long y)
    {
        if(x<10 || y<10)
        {
            return x*y;
        }
        int n=Math.max(Long.toString(x).length(),Long.toString(y).length());
        int half=(n+1)/2;

        long a=x/(long)Math.pow(10,half);
        long b=x%(long)Math.pow(10,half);
        long c=y/(long)Math.pow(10,half);
        long d=y%(long)Math.pow(10,half);

        long ac=karatsuba(a, c);
        long bd=karatsuba(b,d);
        long adbc=karatsuba(a+b,c+d)-ac-bd;

        return (long)(ac*Math.pow(10,2*half)+adbc*Math.pow(10,half)+bd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input: ");
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println("The product of the two numbers is : "+karatsuba(a,b));
        sc.close();
    }
    
}
