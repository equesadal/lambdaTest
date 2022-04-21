package com.example.lambdatest.process;

@FunctionalInterface
interface IIsOddOperation {
    public String Execute(Integer number);
}

public class IsOddOperation {
    
    public IsOddOperation() {
        super();
    }

    public IIsOddOperation GetOperation() {
        return (number) -> {
            Boolean isOdd = number % 2 != 0;
            if (isOdd){
                return "ODD";
            }
            return "EVEN";
        };
    }
}