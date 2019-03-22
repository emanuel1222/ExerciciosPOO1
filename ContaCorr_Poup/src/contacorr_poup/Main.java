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
        
        String nomeCliente = JOptionPane.showInputDialog("Informe o seu nome");
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua agência"));
        int numConta = JOptionPane.showInputDialog("Informe a conta");
        double limite = JOptionPane.showInputDialog("Digite o limite da sua conta");
        double saldo = JOptionPane.showInputDialog("Informe o saldo da conta");
        
        
        
    }
    
}
