/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoperguntas;

/**
 *
 * @author Emanuel
 */
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Questao {

    public int operador1;
    public int operador2;
    public int resposta;
    public int respUser;
    private int operacao;

    public Questao(int operacao){
         this.operacao = operacao;  
    }
    
    public void soma(){
        operador1 = ThreadLocalRandom.current().nextInt(0,100);
        operador2 = ThreadLocalRandom.current().nextInt(0,20);  
        resposta = operador1 + operador2;
        String resp = JOptionPane.showInputDialog("Informe a soma de " + operador1 + " + " + operador2);
        respUser = Integer.parseInt(resp);
    }
    
    public void multiplicacao(){
        operador1 = ThreadLocalRandom.current().nextInt(0,10);
        operador2 = ThreadLocalRandom.current().nextInt(0,10);    
        resposta = operador1 * operador2;
        String resp = JOptionPane.showInputDialog("Informe a multiplicação de " + operador1 + " x " + operador2);
        respUser = Integer.parseInt(resp);      
    }
    
    public void subtracao(){
        operador1 = ThreadLocalRandom.current().nextInt(0,100);
        operador2 = ThreadLocalRandom.current().nextInt(0,20);    
        resposta = operador1 - operador2;
        String resp = JOptionPane.showInputDialog("Informe a subtração de " + operador1 + " - " + operador2);
        respUser = Integer.parseInt(resp);
    }
    
    public void criarQuestao(){  
        
        if (operacao == 1){
            soma();
        }
        
        if (operacao == 2){
            multiplicacao();
        }
        
        if (operacao == 3){
            subtracao();
        }
        
        if(respUser == resposta)
            JOptionPane.showMessageDialog(null,"Parabens, a resposta está correta");
        else
            JOptionPane.showMessageDialog(null,"A resposta está errada");
    }
}