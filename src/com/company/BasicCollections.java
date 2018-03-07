package com.company;

import java.util.ArrayList;

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

    public static ArrayList positiveNumbers(ArrayList<Integer> numArray){
        ArrayList<Integer> positiveNums = new ArrayList<>();
        for(int i= 0; i < numArray.size(); i++){
            if (numArray.get(i) > 0){
                positiveNums.add(numArray.get(i));
            }

        }
        return positiveNums;
    }





}
