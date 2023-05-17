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
public interface IConta{
    
      
    void sacar(double Valor);
    void depositar(double Valor);
    void transferir(double Valor, Conta contaDestino);
    void imprimirExtrato();
    
}
