package ex1.java;


import java.util.Calendar;

import javax.swing.JOptionPane;

public class exUm {
    public static void main(String[] args) {
        /* 
        Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         */

        Calendar c1 = Calendar.getInstance();


        int DIAS_NO_ANO = 365;
		int DIAS_NO_MES = 30;
		int dias;
		int meses;
		int anos;

        int anoAtual = c1.get(Calendar.YEAR);
        

        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento: "));
        
        meses = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento: "));
        
        dias = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento: "));
		
		dias += ((anoAtual - anos) * DIAS_NO_ANO) + (meses * DIAS_NO_MES);
		
		JOptionPane.showMessageDialog(null, "A sua idade em dias é " + dias);


    }
}
