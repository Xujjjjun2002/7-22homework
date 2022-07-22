package org.apache.myfaces.blank.homework_date7_22;

public class cou_sum {
    public static void main(String[] args){
        int[] ar = {68,27,95,88,171,996,51,210};
        int j = 0;
        for (int i = 0 ; i <= 7 ; i++){
            if (ar[i]%10 != 7 && ((ar[i]-(ar[i]%10))/10)%10 !=7 && ar[i]%2 == 0)
            {
                j = j+ar[i];
            }

        }

System.out.println("条件求和结果为"+j);
    }
}
