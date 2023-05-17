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
public class Main {
    public static void main(String[] args) {
        
    Conta cc = new ContaCorrente();
    Conta poupanca = new ContaPoupanca();
    cc.depositar(100);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
    }

}
