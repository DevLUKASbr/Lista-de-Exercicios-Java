package ex4.java;


import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        

        /* Escrever um algoritmo que lê:
        - a porcentagem do IPI a ser acrescido no valor das peças
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) */

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
