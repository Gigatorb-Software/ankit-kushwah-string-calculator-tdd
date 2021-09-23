package com.calculator;
public class MyCalculator {
    public int addCalculator(String input) {
        int addition = 0;
        if (input == null || input.isEmpty()) {
            return addition;
        }
        String strArr[] = input.split(",");

        for (String str : strArr) {
            addition += Integer.parseInt(str);
        }
        return addition;
         }

    public int additionCalculator(String input) throws Exception{
        int addition = 0;
        if(input == null || input.trim().length() == 0){
            return addition;
        }
        String numbersArray[] = null;

        if(input.trim().startsWith("//")){
            String newStr = input.trim().replaceAll("//","");
            String delimiter = newStr.charAt(0)+"";
            String numbers = newStr.substring(1);
            numbersArray = numbers.split(delimiter);
        }else{
            numbersArray = input.trim().replaceAll("\n",",")
                    .split(",");
        }
        String negativeString = "";
        boolean isNegativeNumber = false;
        for(String number: numbersArray){
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt<0){
                    isNegativeNumber = true;
                    if(negativeString.length() > 0) {
                        negativeString = negativeString  + numberInt;
                    }else {
                        negativeString = numberInt + "";
                    }
                }
                addition += numberInt;
            }
        }

       if(isNegativeNumber){
            throw new Exception("negatives not allowed "+negativeString);
        }
        return addition;
    }
}
