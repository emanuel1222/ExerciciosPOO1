/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

/**
 *    - nome
      - sexo
      - idade
      - e-mail
      - login
      - senha
      - cpf
 * @author Emanuel
 */
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo usuário\n0 - Sair"));

        while (operacao != 0){
            
            operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo usuário\n0 - Sair"));

            InsercaoDados cadastro = new InsercaoDados();
            cadastro.dadosUsuario();
            Usuario conta;
            
            
            
            GuardarDados salvar_dados = new GuardarDados();
            //salvar_dados.salvarDados(conta);
    
        }
        
        JOptionPane.showMessageDialog(null,"Finalizando cadastro(s)");

    }
}