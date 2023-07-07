package edu.face.cat2;

import java.util.Scanner;

public class HourGlass {

    public static int findMaxSum(int num[][],int r, int c)
    {
        int count=0;
        int maxCount=0;
        if(r<3 || c<3)
        System.exit(0);

        for(int i=0;i<r-2;i++)
        {
            for(int j=0;j<c-2;j++)
            {
                count=(num[i][j]+num[i][j+1]+num[i][j+2]+num[i+1][j+1]+num[i+2][j]+num[i+2][j+1]+num[i+2][j+2]);
                maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int num[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }

        int result=findMaxSum(num,r,c);
        System.out.println(result);
        sc.close();

    }
    
}
