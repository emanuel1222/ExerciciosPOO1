/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Operações: \n 1 - Soma\n 2 - Multiplicação\n 3 - Subtração\n 0 - Sair"));
       
        while (operacao != 0){
            
            if (operacao == 1){
                Soma sm = new Soma();
                sm.criarPergunta();
            }
            
            else if (operacao == 2){
                Multiplicacao mult = new Multiplicacao();
            }
            else{
                Subtracao sub = new Subtracao();
            }
            
            operacao = Integer.parseInt(JOptionPane.showInputDialog("Operações: \n 1 - Soma\n 2 - Multiplicação\n 3 - Subtração\n 0 - Sair"));
        }
        
        JOptionPane.showMessageDialog(null,"FIM DE JOGO");        
    }
    
}
