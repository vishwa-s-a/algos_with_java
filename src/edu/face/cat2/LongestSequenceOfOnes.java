package edu.face.cat2;
import java.util.Scanner;
public class LongestSequenceOfOnes {
    public static int longestSequenceOfOnes(int num)
    {
        int count=0;
        int maxCount=0;
        String binaryNum=Integer.toBinaryString(num);
        //now we write a for each loop
        for(char data:binaryNum.toCharArray())
        {
            if(data=='1')
            {
                count++;
                if(count>maxCount)
                {
                    maxCount=count;
                }
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("Longest sequence of ones is: "+longestSequenceOfOnes(input));
        sc.close();


    }
}
