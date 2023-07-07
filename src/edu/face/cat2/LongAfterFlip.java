package edu.face.cat2;
import java.util.Scanner;
import java.lang.Math;
public class LongAfterFlip {
    public static int longAfterFlip(int input)
    {
        int previousC=0;
        int currentC=0;
        int maxC=0;
        String binString=Integer.toBinaryString(input);
        for(char data: binString.toCharArray())
        {
            if(data=='1')
            {   
                currentC++;
            }
            else{
                maxC=Math.max(maxC,(previousC+currentC+1));
                previousC=currentC;
                currentC=0;

            }
        }
        maxC=Math.max(maxC,(previousC+currentC+1));
        return maxC;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int input=sc.nextInt();
        System.out.println("Longest sequence of ones after flip: "+longAfterFlip(input));
        sc.close();


    }
    
}
