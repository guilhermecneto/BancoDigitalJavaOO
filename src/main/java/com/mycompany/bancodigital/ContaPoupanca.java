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
public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
    System.out.println("Extrato Conta Poupanca: ");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }

  
    
}
