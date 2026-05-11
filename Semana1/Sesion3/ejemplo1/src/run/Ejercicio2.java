package run;

import javax.swing.*;

public class Ejercicio2 {
    // Pedir dos números y mostrar los números pares entre ellos.
    public static void main(String[] args) {
        int start = 0, end = 0;
        try{
            start = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            end = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Se debe ingresar un valor numérico", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int i = start + 1;
        String text = "";
        String fact = "";
        while ( i<end ){
            if (i%2==0){
                int j = 1;
                while (j <= i+2) {
                    fact += j * (j+1) + " , ";
                    j++;
                }
                text =+ i + " -> " + fact + "\n";
                fact = "";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
