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
public class Conta {
    private String nomeCliente;    
    private int numero;
    private double limite;
    private int agencia;
    private double saldo;

    public Conta(String numero, String nomeCliente, String saldo, String limite, String agencia){
        this.numero = Integer.parseInt(numero);
        this.nomeCliente = nomeCliente;
        this.saldo = Double.parseDouble(saldo);
        this.limite = Double.parseDouble(limite);
        this.agencia = Integer.parseInt(agencia);
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean depositar(double valor) {
        return true;
    }
    
    public boolean sacar(double valor) {
        return true;
    }
    
    public void imprimirSaldo(){
        System.out.println("Prezado, "+ nomeCliente);
        System.out.println("Seu saldo atual é: R$ "+ saldo);
    }
}
    
