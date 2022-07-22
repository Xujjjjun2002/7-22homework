package org.apache.myfaces.blank.homework;

import java.util.Random;

public class score {
    public static void main(String[] args){
        int[] r = new int[6];
        int [] b = rand(r);
        int c = aver(b);
        System.out.print("评委打分为");
        turn_over.pr(b);
        System.out.println("最终得分为"+c);
    }
    //产生随机数组
    public static int[] rand(int[] k){
        int[] m = new int[k.length];
        Random r = new Random();
        for (int i = 0 ; i <= k.length-1 ; i++)
        {m[i] = r.nextInt(101);

        }
        return m;
    }
    //计算最终得分
    public static int aver(int[] x){
        int a = 0;
        int min = 101;
        int max = 0;
            for (int i = 0 ; i <= x.length-1 ; i++)
            { a = a + x[i];
                if (x[i] > max) {max = x[i];}
                if (x[i] < min) {min = x[i];}
            }
            a = (a - max - min)/(x.length-2) ;
        return a;
    }
}
