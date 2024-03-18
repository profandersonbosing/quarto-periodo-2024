/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1403.model;

/**
 *
 * @author andersonbosing
 */
public class Carro {
    
    private String cor;
    private Modelo modelo;
    private double potencia;
    private String placa;
    private String chassi;
    private int renavam;
    private int anoFabricacao;
    private double valor;
    private boolean isBlindado;
    private Pessoa proprietario;
    private Pessoa vendedor;



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isIsBlindado() {
        return isBlindado;
    }

    public void setIsBlindado(boolean isBlindado) {
        this.isBlindado = isBlindado;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", modelo=" + modelo + ", potencia=" + potencia + ", placa=" + placa + ", chassi=" + chassi + ", renavam=" + renavam + ", anoFabricacao=" + anoFabricacao + ", valor=" + valor + ", isBlindado=" + isBlindado + ", proprietario=" + proprietario + '}';
    }
    
}
