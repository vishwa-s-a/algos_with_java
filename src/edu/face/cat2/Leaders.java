package edu.face.cat2;

public class Leaders {
    public static void findLeaders(int arr[])
    {
        int size=arr.length;
        int max=arr[size-1];
        System.out.println(max+" ");
        for(int i=size-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                System.out.println(max+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        findLeaders(arr);
    }
    
    
}
