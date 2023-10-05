package com.company;
class properties {
    public int a = 2;
    public boolean b = true;
    public double c = 3.141592653589793238462643383279502884197;
    public String d = "It Depends";
    public void fullproperties() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class task5 {
    public static void main(String[] args) {
        properties obj = new properties();
        System.out.println(" int " + obj.a);
        System.out.println(" boolean " + obj.b);
        System.out.println(" double " + obj.c);
        System.out.println(" String " + obj.d);
       obj.fullproperties();
    }

}
