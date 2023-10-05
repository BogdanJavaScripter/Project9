package com.company;
class privateProperties {
    private int a = 2;
    private double c = 3.141592653589793238462643383279502884197;

    public void privateproperties() {
        System.out.println("private int: " + a);
        System.out.println("private double: " + c);
    }
}
    public class task6 {
        public static void main(String[] args) {
            privateProperties obj = new privateProperties();


            System.out.println("Accessing private properties from a method inside the class:");
            obj.privateproperties();


            //System.out.println("int: " + obj.a);
            //System.out.println("double: " + obj.c);
        }
    }
