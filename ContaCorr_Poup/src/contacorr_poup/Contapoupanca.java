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
public class Contapoupanca {
    
    private String nomeCliente;
    private int numero;
    private double saldo = 0;
    private int agencia;

    
    public Contapoupanca(String nomeCliente, int numero, double saldo, int agencia){
        
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public void imprimirSaldo_p(){
        System.out.println("Prezado, "+ nomeCliente +", seu saldo na conta poupança será informado abaixo");
        System.out.println("Atualmente seu saldo é: R$ "+ saldo);
    }
}
//