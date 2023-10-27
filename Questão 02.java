package Questão02.java;

import javax.swing.JOptionPane;

public class Questão02 {
    public static void main(String[] args) {

        float media1, media2, somaMedia;

        media1 = (8 + 9 + 7) / 3;
        JOptionPane.showMessageDialog(null, "Média dos números 8, 9 e 7:\n" + media1);

        media2 = (4 + 5 + 6) / 3;        
        JOptionPane.showMessageDialog(null, "Média dos números 4, 5 e 6:\n" + media2);

        somaMedia = (media1 + media2) / 2;
        JOptionPane.showMessageDialog(null, "Média das média1 e média2:\n" + somaMedia);

    }
}
