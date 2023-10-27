package Questão05.java;

import javax.swing.JOptionPane;

public class Questão05 {
    public static void main(String[] args) {
        
        float salario, salarioMinimo, quantSalario;

        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o seu salário"));
        salarioMinimo = 788.00f;

        quantSalario = salario / salarioMinimo;
        
        JOptionPane.showMessageDialog(null, "Ele recebe: " + String.format("%.2f", quantSalario) + " salárioMinimo");

    }
}
