package Questão04.java;


import javax.swing.JOptionPane;

public class Questão04 {
    public static void main(String[] args) {

        String msg = "Entre com o código da peça:"; 
        String msgIPI = "Entre com o IPI:"; 
        String msgValor = "Entre com o valor da peça:"; 
        String msgQuant = "Entre com a quantidade de peças:";
        

        int codigoPeca1, codigoPeca2;
        float valorPeca1, valorPeca2;
        int quantPeca1, quantPeca2;
        float formula, IPI;

        IPI = Integer.parseInt(JOptionPane.showInputDialog(msgIPI));

        codigoPeca1 = Integer.parseInt(JOptionPane.showInputDialog(msg));
        codigoPeca2 = Integer.parseInt(JOptionPane.showInputDialog(msg));

        valorPeca1 = Float.parseFloat(JOptionPane.showInputDialog(msgValor));
        valorPeca2 = Float.parseFloat(JOptionPane.showInputDialog(msgValor));

        quantPeca1 = Integer.parseInt(JOptionPane.showInputDialog(msgQuant));
        quantPeca2 = Integer.parseInt(JOptionPane.showInputDialog(msgQuant));

        formula = (valorPeca1 * quantPeca1 + valorPeca2 * quantPeca2) + (IPI / 100 + 1);
        
        String msgValorFinal = "O valor final pela compra das peças com os códigos " + codigoPeca1 + " e " + codigoPeca2 + " é de R$ " + String.format("%.2f", formula);
        
        msgs(msgValorFinal);

    }
    
    public static void msgs(String frase) {

        JOptionPane.showMessageDialog(null,frase);
    
    }
}
