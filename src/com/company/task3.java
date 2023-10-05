package com.company;
class itsStealMe {
    private void itsgonnabeerror(){
        System.out.println("Dont touch it blo its private information");
    }
}
public class task3 {
    public static void main(String[] args) {
        itsStealMe obj = new itsStealMe();
        //obj.itsgonnabeerror();
    }
}
