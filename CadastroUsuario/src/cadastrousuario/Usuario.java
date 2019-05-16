/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author Emanuel
 */
public class Usuario {
    
    private String nomeUsuario;
    private String sexo;
    private int idade;
    private String email;
    private String login;
    private String senha;
    private long cpf;
    
    public Usuario(String nome, String sexo, String idade, String email, String login, String senha, String cpf) throws Exception{
        
        if(nome.equalsIgnoreCase("")){
            throw new Exception("\nNome de usuario não pode ser vazio\n");            
        }
        
        if(sexo.equalsIgnoreCase("")){
            throw new Exception("\nSexo de usuario não pode ser vazio\n");            
        }
        
        if (!sexo.equals("M")  & !sexo.equals("F") & !sexo.equals("m") & !sexo.equals("f")){
            throw new Exception("\nSexo inválido\n"); 
        }
        
        if(String.valueOf(idade).equalsIgnoreCase("") | String.valueOf(idade).contains("-") | String.valueOf(idade).equals("0")){
            if(String.valueOf(idade).equalsIgnoreCase("")){
                throw new Exception("\nO campo IDADE está vazio\n");
            }
            else{
                throw new Exception("\nA idade deve ser maior que 0\n"); 
            }            
        }
        
        if(!email.contains("@hotmail.com") & !email.contains("@outlook.com") & !email.contains("@gmail.com") & !email.contains("@yahoo.com")){
            throw new Exception("\ne-maill inválido\n");     
        }
        
        if(senha.equalsIgnoreCase(login)){
            throw new Exception("\nA senha deve ser diferente do login\n");        
        }
        
        //if(String.valueOf(cpf).length()){
        //}
        
        this.nomeUsuario = nome;
        this.sexo = sexo;
        this.idade = Integer.parseInt(idade);
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.cpf = Long.parseLong(cpf);
    }

    public String getNome() {
        return nomeUsuario;
    }

    public void setNome(String nome) {
        this.nomeUsuario = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    private int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
