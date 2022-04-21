package com.example.lambdatest.process;

import java.util.HashMap;
import java.util.Map;

public enum OperationTypeEnum {
    IsOdd, IsPrime, IsPalindrome;

    private int value;
    private static Map map = new HashMap<>();

    private OperationTypeEnum() {
    }
    
    private OperationTypeEnum(int value) {
        this.value = value;
    }

    static {
        for (OperationTypeEnum operation : OperationTypeEnum.values()) {
            map.put(operation.value, operation);
        }
    }

    public static OperationTypeEnum valueOf(int operation) {
        return (OperationTypeEnum) map.get(operation);
    }

    public int getValue() {
        return value;
    }
}