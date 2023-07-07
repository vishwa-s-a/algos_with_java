package edu.face.cat2;

public class Mes {

    public static int getMax(int arr[])
    {
        int leftC=0;
        int totalC=0;
        int maxC=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            totalC+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalC-=arr[i];
            if(leftC==totalC && leftC>maxC){
                maxC=leftC;
            }
            leftC+=arr[i];
        }
        return maxC;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int maxSum = getMax(arr);
        System.out.println("Max Equilibrium Sum : " + maxSum);
    }
    
}
