/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.banco2024.models;

import br.unipar.banco2024.enums.TipoContaEnum;

/**
 *
 * @author andersonbosing
 */
public class Conta {
    
    private int nrConta;
    private String dsNomeBanco;
    private Correntista correntista;
    private TipoContaEnum tpConta; 
    private double vlSaldo;

    public Conta() {
    }

    public Conta(int nrConta, String dsNomeBanco, Correntista correntista, 
            TipoContaEnum tpConta, double vlSaldo) {
        this.nrConta = nrConta;
        this.dsNomeBanco = dsNomeBanco;
        this.correntista = correntista;
        this.tpConta = tpConta;
        this.vlSaldo = vlSaldo;
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public String getDsNomeBanco() {
        return dsNomeBanco;
    }

    public void setDsNomeBanco(String dsNomeBanco) {
        this.dsNomeBanco = dsNomeBanco;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public TipoContaEnum getTpConta() {
        return tpConta;
    }

    public void setTpConta(TipoContaEnum tpConta) {
        this.tpConta = tpConta;
    }

    public double getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(double vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "nrConta=" + nrConta + ", dsNomeBanco=" + dsNomeBanco + ", correntista=" + correntista + ", tpConta=" + tpConta + ", vlSaldo=" + vlSaldo + '}';
    }

    
    
}
