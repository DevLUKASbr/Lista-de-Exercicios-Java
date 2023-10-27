package Questão03.java;

import javax.swing.JOptionPane;

public class Questão03 {
    public static void main(String[] args) {
        /* 3. Informar um saldo e imprimir o saldo com reajuste de 1%. */

        String msg = "entre com o saldo";
        float saldo;
        float reajuste;


        saldo = Float.parseFloat(JOptionPane.showInputDialog(msg));

        reajuste = saldo + (saldo * 0.01f);

        JOptionPane.showMessageDialog(null, reajuste);

        
    }
    
}
