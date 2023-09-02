package edu.face.basics;

public class Pallindrome {
    public static Boolean pallindrome(int x)
    {
        int original =x;
        int reversed=0;
        while(x>0)
        {
            reversed<<=1;
            reversed |= (x & 1);
            x>>=1;
        }
        System.out.println(reversed);
        return reversed==original;
    }
    public static void main(String args[]) {
        int x=17;
        if(pallindrome(x))
        {
            System.out.println("It is a binary Pallindrome");
        }
        else
        System.out.println("It is not binary pallindrome");
    }
    
}
