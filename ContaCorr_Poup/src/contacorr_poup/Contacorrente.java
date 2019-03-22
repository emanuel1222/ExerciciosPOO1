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
public class Contacorrente {
    
    private String nomeCliente;
    private int numero;
    private double saldo = 0;
    private int agencia;
    private double limite = 0;
    
    public ContaCorrente(String nomeCliente, int numero, double saldo, int agencia, double limite ){
        
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.limite = limite;
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void imprimirSaldo(){
        System.out.println("Prezado, "+ nomeCliente);
        System.out.println("Atualmente seu saldo é: R$ "+ saldo);
        
    }
}
