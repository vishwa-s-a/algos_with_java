package edu.face.cat2;

import java.util.Scanner;

public class BlockSwap {

    public static void swap(int arr[],int fi,int si,int d)
    {
        for(int i=0;i<d;i++)
        {
            int temp=arr[fi+i];
            arr[fi+i]=arr[si+i];
            arr[si+i]=temp;
        }
    }


    public static void blockSwap(int arr[],int d,int n)
    {
        int i,j;
        if(d==0 || d==n)
        {
            return;
        }
        if(d>n)
        d=d%n;
        i=d;
        j=n-d;
        while(i!=j)
        {
            if(i<j)
            {
                swap(arr,d-i,d+j-i,i);
                j-=i;
            }

            else{
                swap(arr,d-i,d,j);
                i-=j;
            }
        }
        swap(arr,d-i,d,i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of times rotation to be done: ");
        int freq=sc.nextInt();
        blockSwap(arr,freq,size);
        System.out.println("The rotated array is : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
    
}
