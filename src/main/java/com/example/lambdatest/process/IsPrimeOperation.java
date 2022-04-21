package com.example.lambdatest.process;

@FunctionalInterface
interface IIsPrimeOperation {
    public String Execute(Integer number);
}

public class IsPrimeOperation {
    
    public IsPrimeOperation() {
        super();
    }

    public IIsPrimeOperation GetOperation() {
        return (number) -> {
            if (number <= 1) {
                return "COMPOSITE";
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return "COMPOSITE";
                }
            }
            return "PRIME";
        };
    }
}