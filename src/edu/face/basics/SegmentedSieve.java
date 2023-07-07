package edu.face.basics;
import java.util.Arrays;

import java.util.ArrayList;
import java.lang.Math;

public class SegmentedSieve {
    public static void getPrime(ArrayList<Integer> prime, int R)
    {
        //create a dummy array of Boolean type
        Boolean c[]=new Boolean[R+1];
        Arrays.fill(c,true);// we will fill all index in dummy array as true
        // but the 0 and 1 index of this array will be false;
        c[0]=false;
        c[1]=false;
        // now we basically implement the simple sieve algo
        for(int i=2;i*i<=R;i++)
        {
            if(c[i]==true)
            {
                for(int j=i*i;j<=Math.sqrt(R);j=j+i)
                {
                    c[j]=false;
                }
            }
        }

        //now to store all the primes upto the given range in the prime arrayList
        for(int i=2;i*i<=R;i++)
        {
            if(c[i]==true){
                prime.add(i);
            }
        } 
    }

    public static void segmentSieve(int l, int h)
    {
        ArrayList<Integer> chprime=new ArrayList<Integer>();

        getPrime(chprime, h);

        Boolean dummy[]=new Boolean[h-l+1];
        Arrays.fill(dummy,true);
        // here dummy[0] indicates whether l is prime or not similarly dummy[1] 
        //indicates whether l+1 is prime or not
        for(int i:chprime)
        {
            int low=(l/i);
            // here low means the first multiple of prime which is in range [l,h]
            if(low<=1)
            low=i+i;

            else if(l%i!=0)
            low=(low*i)+i;

            else{
                low=low*i;
            }

            for(int j=low;j<=h;j+=i)
            {
                dummy[j-l]=false;
            }
        }

        // now to print all the prime numbers
        for(int i=l;i<=h;i++)
        {
            if(dummy[i-l]==true){
                // if it is true then it is a prime number and we print as result
                System.out.println(i+" ");
            }
        }

    }
    public static void main(String args[])
    {
        segmentSieve(10, 100);
    }
    
}
