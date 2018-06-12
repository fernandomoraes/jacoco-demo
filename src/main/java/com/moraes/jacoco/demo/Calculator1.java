package com.moraes.jacoco.demo;

class Calculator1 {

    int plus(final Object source, final int value) {
        //this is to create a complexity in the code...
        if (source instanceof Integer) {
            return ((Integer) source) + value;
        }
        if (source instanceof Long) {
            return ((Long) source).intValue() + value;
        }
        return value;
    }

}
