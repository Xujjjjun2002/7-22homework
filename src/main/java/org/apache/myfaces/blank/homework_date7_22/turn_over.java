package org.apache.myfaces.blank.homework_date7_22;

public class turn_over {
    public static void main(String[] args){
        int[] a = { 19, 28, 37, 46, 50 };
        int[] b = { 0 , 0 , 0 , 0 , 0 };
        for (int i = 0 ; i <= 4 ; i++)
        {b[i] = a[4-i];

    }
        pr(b);


}
    public static void pr(int[] b){
        for (int i = 0; i <= b.length-2 ; i++)
        {System.out.print(b[i]+",");

    } System.out.print(b[b.length-1]);

}}
