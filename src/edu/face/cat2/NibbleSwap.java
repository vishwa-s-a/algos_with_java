package edu.face.cat2;

import java.util.Scanner;

// It's important to note that nextByte() expects the user to enter a valid byte value. If the input is not a valid byte (outside the range of -128 to 127), 
// an InputMismatchException will be thrown. You can handle this exception using a try-catch block if needed.
public class NibbleSwap {
    public static byte swapNibbles(byte value)
    {
        byte upperNibble=(byte)((value & 0xF0)>>4);
        byte lowerNibble=(byte)((value & 0x0F));

        byte swappedByte=(byte)((lowerNibble<<4)|upperNibble);

        return swappedByte;
    }
    public static void main(String[] args) {
        System.out.println("Enter the input: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();//take input  in hexadecimal value like 0xAB
        byte byteValue=0;
        input=input.substring(2);
        System.out.println(input);
        //converting hexadecimal to decimal
        try{
            int value=Integer.parseInt(input, 16);//we get decimal out of hexadecimal
            byteValue=(byte)value;
            System.out.println("byte value: "+byteValue);//we get byte out of decimal
        }
        catch(NumberFormatException e){
            System.out.println(e.toString());
        }

        //if direct input is given then we have to do in this way
        // byte byteValue = (byte) 0xAB;
        // System.out.println(byteValue);

        byte swappedByte=swapNibbles(byteValue);

        System.out.println("Original byte value: "+Integer.toBinaryString(byteValue & 0xFF));
        System.out.println("Swapped byte: "+Integer.toBinaryString(swappedByte & 0xFF));
        sc.close();
    }
    
}
