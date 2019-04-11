/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoheranca;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author Emanuel
 */
public abstract class Questao {
    int operador1;
    int operador2;
    String resp;
    //int resposta;
    
    public Questao(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,100);  
    }
    
    public abstract int validarResposta();
    
    public void imprimeValidacao(){
        if(this.validarResposta() == 1){
            JOptionPane.showMessageDialog(null,"Respota correta!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Resposta errada!");
        }
        
    }
}
