package run;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número: ", "Tabla de multiplicación", JOptionPane.INFORMATION_MESSAGE));
            String table = "Tabla de multiplicación\n";
            for (int i = 1; i <=
                    12; i++) {
                table += "  " + i + " * " + num + " = " + (num * i) + "\n";
            }
            JOptionPane.showMessageDialog(null, table, "Tabla de multiplicación", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
