package ex6.java;

import javax.swing.JOptionPane;

public class ex06 {

    public static void main(String[] args) {
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Valor"));

        String antecessor = "O Antecessor de " + valor + " é " + (valor - 1);

        String sucessor = "O Sucessor de " + valor + " é " + (valor + 1);

        msgs(antecessor);
        msgs(sucessor);

    }

    public static void msgs(String frase) {

        JOptionPane.showMessageDialog(null,frase);
    
    }
    
}
