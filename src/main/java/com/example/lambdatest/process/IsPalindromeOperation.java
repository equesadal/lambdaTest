package com.example.lambdatest.process;

@FunctionalInterface
interface IIsPalindromeOperation {
    public String Execute(Integer number);
}

public class IsPalindromeOperation {
    
    public IsPalindromeOperation() {
        super();
    }

    public IIsPalindromeOperation GetOperation() {
        return (number) -> {
            Integer reversedNumber = 0;
            Integer temporalCalculation = number;
            Integer remainder = 0;

            while(temporalCalculation > 0){    
                remainder = temporalCalculation % 10; 
                reversedNumber = (reversedNumber * 10) + remainder;    
                temporalCalculation = temporalCalculation / 10;
            }

            if (number.compareTo(reversedNumber) == 0){
                return "PALINDROME";
            }
            return "NOT PALINDROME";
        };
    }
}