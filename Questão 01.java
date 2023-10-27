package Questão01.java;


import java.util.Calendar;

import javax.swing.JOptionPane;

public class Questão01 {
    public static void main(String[] args) {
      
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
