/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.banco2024.interfaces;

import br.unipar.banco2024.models.Conta;

/**
 *
 * @author andersonbosing
 */
public interface BancoInterface {
    
    public String extrato(Conta conta);
    void sacar(Conta conta, double vlrSaque);
    void depositar(Conta conta, double vlrDeposito);
}
