package com.stackroute.pe3;
import java.awt.*;
import java.io.*;
import java.util.*;
public class ConsecutiveNumbers
    {
        public String Checkconsecutiveornot(int arr[]){
        //System.out.println(numbers);
        //String numbers[]=arr.split(",");
        // int arr2[]=new int[numbers.length];

        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        int flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if((arr[i]+1)!=arr[i+1])
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            return "consecutive numbers";
        }
        else
        {
            return "Not consecutive numbers";
        }

    }

}


