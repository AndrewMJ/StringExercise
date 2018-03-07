package com.company;

public class BasicCollections {

    public static int arraySum(int[] numArray){
        int total = 0;
        for(int num : numArray){
            total += num;
        }
        return total;
    }

    public static int largestNum(int[] numArray){
        int largestNum = numArray[0];
        for(int num : numArray){
            if (num > largestNum){
                largestNum = num;
            }
        }
        return largestNum;
    }

    //public static int positiveNumbers




}
