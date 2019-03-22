/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author 20171bsi0146
 */
import javax.swing.JOptionPane;
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numConta = JOptionPane.showInputDialog("Digite o número da conta");
        String numAgencia = JOptionPane.showInputDialog("Digite o número da agência");
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
        String limiteInicial = JOptionPane.showInputDialog("Digite o limite inicial");
        String saldoInicial = JOptionPane.showInputDialog("Digite o saldo da conta");
        
        Conta contaCliente = new Conta(numConta,nomeCliente,saldoInicial,limiteInicial,numAgencia);
        contaCliente.imprimirSaldo();
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvarConta(contaCliente);
        // TODO code application logic here
    }
    
}
