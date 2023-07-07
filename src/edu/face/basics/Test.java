package edu.face.basics;

import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.ArrayList;

public class Test {
    public static void get(ArrayList<Integer> num, int R)
    {
        Boolean c[]=new Boolean[R+1];
        Arrays.fill(c,true);
        c[0]=false;
        c[1]=false;
        for(int i=2;i*i<=R;i++)
        {
            if(c[i]==true)
            {
                for(int p=i*i;p<=Math.sqrt(R);p+=i)
                {
                    c[p]=false;
                }
            }
        }
        for(int i=2;i*i<=R;i++)
        {
            if(c[i]==true)
            {
                num.add(i);
            }
        }
    }
    public static void segment(int l, int h)
    {
        ArrayList<Integer> p=new ArrayList<Integer>();
        get(p, h);
        Boolean dummy[]=new Boolean[h-l+1];
        Arrays.fill(dummy,true);
        for(int i:p)
        {
            int low=(l/i);
            if(low<=1)
            {
                low=i+i;
            }
            else if(l%i!=0)
            {
                low=(low*i)+i;
            }
            else{
                low=low*i;
            }
            for(int j=low;j<=h;j+=i)
            {
                dummy[j-l]=false;
            }
        }
        for(int i=l;i<=h;i++)
        {
            if(dummy[i-l]==true)
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) 
    { 
        float n=8;
        n=n+(float)0.3;
        System.out.println(n);
    }
}
