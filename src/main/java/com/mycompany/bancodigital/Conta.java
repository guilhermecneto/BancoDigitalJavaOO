/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancodigital;

/**
 *
 * @author ANONYMOUS
 */
public abstract class Conta implements IConta {
        
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 2;
    
    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
     public int getNumero(){
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double Valor) {
        saldo -= Valor;
    }

    @Override
    public void depositar(double Valor) {
        saldo +=  Valor;
    }

    @Override
    public void transferir(double Valor, Conta contaDestino) {
        this.sacar(Valor);
        contaDestino.depositar(Valor);
    }
         
}
