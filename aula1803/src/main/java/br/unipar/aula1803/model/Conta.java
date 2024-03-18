/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1803.model;

/**
 *
 * @author andersonbosing
 */
public class Conta {
    
    private String nrConta;
    private Pessoa correntista;
    private int tipoConta; //0 - Conta Corrente 1 - Conta Poupança
    private double vlSaldo;

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(double vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "nrConta=" + nrConta + ", correntista=" + correntista + ", tipoConta=" + tipoConta + ", vlSaldo=" + vlSaldo + '}';
    }
    
}
