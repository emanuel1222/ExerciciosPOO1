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
        Telas msg = new Telas();
        
        while (operacao != 0 | operacao == 1){     
            InsercaoDados cadastro = new InsercaoDados();
            Usuario nova_conta = cadastro.dadosUsuario();
            GuardarDados salvar_dados = new GuardarDados();
            salvar_dados.salvarDados(nova_conta);  
            operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo usuário\n0 - Sair"));
        }
        msg.confirmaCadastro();
    }
}