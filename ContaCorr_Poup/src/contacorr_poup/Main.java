/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorr_poup;

/**
 *
 * @author 20171BSI0146
 */

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nomeC = JOptionPane.showInputDialog("Informe o seu nome");
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua agência"));
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe a conta"));
        double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da sua conta"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta"));

        //Atualizar depois
        Contacorrente contaCliente = new Contacorrente(nomeC,numConta,saldo,numAgencia,limite);
        contaCliente.imprimirSaldo_c();

        Contapoupanca contaCliente_p = new Contapoupanca(nomeC,numConta,saldo,numAgencia);
        contaCliente_p.imprimirSaldo_p();
        
        PersistenciaArquivos salvar = new PersistenciaArquivos();
        salvar.salvarConta(contaCliente);
        //
    }
    
}
