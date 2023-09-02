package edu.face.fat;

import java.util.Scanner;

public class majority {
    public static int findMajority(int arr[])
    {
        int  count=0,candidate=0;
        for(int num:arr)
        {
            if(count==0)
            {
                candidate=num;
                count++;
            }
            else{
                if(candidate==num)
                {
                    count++;
                }
                else
                count--;
            }
        }
        int maxCount=0;
        for(int n:arr)
        {
            if(n==candidate)
            {
                maxCount++;
            }
        }
        return (maxCount>(arr.length)/2)?candidate:-1;
    }
    public static void main(String args[])
    {
        int arr[]={4,7,4,4,7,4,4,9,4,3};
        int result=findMajority(arr);
        if(result!=-1)
        System.out.println("Majority element is: "+result);
        else
        System.out.println("Majority element not found");
    }    
}
