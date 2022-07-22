package org.apache.myfaces.blank.homework;

public class rabbit {
    public static void main(String[] args)
    {
System.out.println(rabbit.num_rats(20));
    }


    public static int num_rats(int a){
    int[] j = new int[30];
    j[1] = 1;
    j[2] = 1;
    for (int i = 3;i <= a; i++ )
    {j[i] =  j[i-1] + j[i-2];
    }

     return j[a];

}}