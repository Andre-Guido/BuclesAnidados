package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        double num1= 0.0, num2 = 0.0, num3 = 0.0, nummayor;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite el primer número: ");
            num1 = sc.nextDouble();
            System.out.println("Digite el segundo numero: ");
            num2 = sc.nextDouble();
            System.out.println("Digite el termo numero: ");
            num3 = sc.nextDouble();
        }catch(InputMismatchException ex){
            System.out.println("Solamente se aceptan valores numéricos.");
            return;
        }
        if (num1 > num2 && num1 > num3){
            nummayor = num1;
            System.out.println("El mayor de los números es: " + nummayor);
        }else if (num2 > num1 && num2 > num3){
            nummayor = num2;
            System.out.println("El mayor de los números es: " + nummayor);
        }
        else if (num3 > num1 && num3 > num2){
            nummayor = num3;
            System.out.println("El mayor de los numeros es: " + nummayor);
        }
        else if (num1 == num2 && num1 == num3){
            System.out.println("Todos los números son iguales.");
        }
    }
}
