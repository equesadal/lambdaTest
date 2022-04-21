package com.example.lambdatest.process;

public class OperationInput {
    public OperationTypeEnum operationType;
    public Integer number;

    public OperationInput(OperationTypeEnum operationType, Integer number) {
        this.operationType = operationType;
        this.number = number;
    }
}