/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.banco2024.models;

import br.unipar.banco2024.interfaces.BancoInterface;
import br.unipar.banco2024.interfaces.SeguradoraInterface;

/**
 *
 * @author andersonbosing
 */
    public class PicPayImp implements BancoInterface, SeguradoraInterface {

    @Override
    public String extrato(Conta conta) {
        String resultado = "Conta Do Banco = "+ conta.getDsNomeBanco();
        resultado += " Numero da Conta = "+ conta.getNrConta();
        resultado += " Correntista = "+ conta.getCorrentista().getNome();
        resultado += " Saldo = " + conta.getVlSaldo();
        
        return resultado;
    }

    @Override
    public void sacar(Conta conta, double vlrSaque) {
        conta.setVlSaldo(conta.getVlSaldo() - vlrSaque);
    }

    @Override
    public void depositar(Conta conta, double vlrDeposito) {
        conta.setVlSaldo(conta.getVlSaldo() + vlrDeposito);
    }

    @Override
    public void segurarBem(double valor) {
        System.out.println("Bem assegurado");
    }
    
}
