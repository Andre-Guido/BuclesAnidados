package main;

public class
Operador {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        String Num1, Num2;
        Num1 = ""+num1;
        Num2 = ""+num2;

        System.out.println(Num1 + " + " + Num2 +" = " + (Num1+Num2));
        System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
        System.out.println(num1 + " - " + num2 +" = " + (num1-num2));
        System.out.println(num1 + " * " + num2 +" = " + (num1*num2));
        System.out.println(num1 + " / " + num2 +" = " + ((float)num1/(float)num2));
        System.out.println(num1 + " % " + num2 +" = " + (num1%num2));
        System.out.println(num1 + " < " + num2 +" = " + (num1<num2));
        System.out.println(num1 + " > " + num2 +" = " + (num1>num2));
        System.out.println(num1 + " <= " + num2 +" = " + (num1<=num2));
        System.out.println(num1 + " >= " + num2 +" = " + (num1>=num2));
        System.out.println(num1 + " == " + num2 +" = " + (num1==num2));
        System.out.println(num1 + " != " + num2 +" = " + (num1!=num2));
    }
}
