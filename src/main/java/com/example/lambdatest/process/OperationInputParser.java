package com.example.lambdatest.process;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationInputParser {
    
    public ArrayList<OperationInput> Parse(String input) {
        if (input == null || input.isEmpty()) throw new IllegalArgumentException(input);

        ArrayList<OperationInput> parsedInput = new ArrayList<OperationInput>();
        Scanner scanner = new Scanner(input);

        int countOfInputs = Integer.parseInt(scanner.nextLine());

        while (countOfInputs > 0 && scanner.hasNextLine()) {
            countOfInputs = countOfInputs - 1;

            String individualLine = scanner.nextLine();
            String[] splitedValues = individualLine.split("\\s+");
            
            int requestedOperationType = Integer.parseInt(splitedValues[0]);
            int requestedOperationValue = Integer.parseInt(splitedValues[1]);
             
            OperationTypeEnum type = MapToOperationTypeEnum(requestedOperationType);
            parsedInput.add(new OperationInput(type, requestedOperationValue));
        }
        scanner.close();
        return parsedInput;
    }

    private OperationTypeEnum MapToOperationTypeEnum(int value) {
        OperationTypeEnum type = OperationTypeEnum.IsOdd;
        switch (value) {
            case 1:
                type = OperationTypeEnum.IsOdd;
                break;
            case 2:
                type = OperationTypeEnum.IsPrime;
                break;
            case 3:
                type = OperationTypeEnum.IsPalindrome;
                break;
            default:
                break;
        }
        return type;
    }
}
