package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Inicialización de variables.
        double weight, distance = 0.0, temporal;
        String type;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido.");

        try {
            // Solicitud del peso del artículo.
            System.out.println("Ingrese el peso (en Kg) del artículo: ");
            temporal = sc.nextDouble();
        }
        // Manejo de excepción.
        catch (InputMismatchException e) {
            System.out.println("Solo se admiten valores numéricos.");
            return;
        }
        // Validación para saber si es mayor que 0.
        if (temporal < 0) {
            System.out.println("No se admiten valores negativos.");
            System.out.println("Ingrese un valor de peso válido.");
            return;
        } else {
            weight = temporal;
        }

        // Validaciones para saber si el producto es frágil o no.
        System.out.println("¿Es un producto frágil? (S/N): ");
        type = sc.next().trim().toUpperCase();
        if (type.equals("S") && weight < 50) {
            System.out.println("Envío Prémium.");
            return;
        } else if (type.equals("S") && weight > 50) {
            System.out.println("Servicio no disponible.");
            return;
        } else if (type.equals("N")) {
            try {
                System.out.println("Ingrese la distancia (en Km) de envío del producto: ");
                temporal = sc.nextDouble();
                if (temporal < 0) {
                    System.out.println("No se admiten valores negativos.");
                    System.out.println("Ingrese un valor de distancia válido.");
                    return;
                } else {
                    distance = temporal;
                }
            }
            // Manejo de excepción.
            catch (InputMismatchException e) {
                System.out.println("Solo se admiten valores numéricos.");
                return;
            }
        }

        // Resultados
        if (weight >= 50 && distance >= 100) {
            System.out.println("Transporte pesado.");
        } else if (weight <= 10 && distance <= 20) {
            System.out.println("Dron.");
        } else {
            System.out.println("Servicio no disponible.");
        }
    }
}



