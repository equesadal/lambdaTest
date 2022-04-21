package com.example.lambdatest.process;

public class OperationResolver {

    public String Resolve(OperationTypeEnum type, Integer value) {
        switch (type) {
            case IsOdd:
                String result1 = new IsOddOperation().GetOperation().Execute(value);
                return result1;

            case IsPrime:
                String result2 = new IsPrimeOperation().GetOperation().Execute(value);
                return result2;
        
            case IsPalindrome:
                String result3 = new IsPalindromeOperation().GetOperation().Execute(value);
                return result3;
            default:
                break;
        }
        return "";
    }
}