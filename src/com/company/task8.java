package com.company;
class ConstructorAndArguments {
    private int value;

    public ConstructorAndArguments(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    }

public class task8 {

    public static void main(String[] args) {

        ConstructorAndArguments obj1 = new ConstructorAndArguments(3);
        ConstructorAndArguments obj2 = new ConstructorAndArguments(79);
        System.out.println("Object 1 value: " + obj1.getValue());
        System.out.println("Object 2 value: " + obj2.getValue());


    }

    }



