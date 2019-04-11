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
public class Soma extends Questao {
    @Override
    
     public int validarResposta(){
         
        if(this.operador1 + this.operador2 == Integer.parseInt(this.resp)){
            return 1;
        }
        return 0;
    }
    
    public void criarPergunta(){
        this.resp = JOptionPane.showInputDialog("Informe a soma de " + this.operador1 + " + " + this.operador2);
        imprimeValidacao();
    }
    
    //public void imprimeValidacao();
}
