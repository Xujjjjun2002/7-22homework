package org.apache.myfaces.blank.homework;

import java.util.Scanner;
public class fin {
    public static void main(String[] args){
        System.out.println("请输入数字");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (findd(a) >=0)
        {System.out.println("该数字位于第"+(1+findd(a))+"位");}
        else {System.out.println("不在数组中");}
    }

    public static int findd(int a){
        int[] ar = { 19, 28, 37, 46, 50 };
           for(int i = 0 ; i <= 4 ; i++ )
           {
               if (a == ar[i])
               {
                   return i;
               }

           }
        return -1;
}}
