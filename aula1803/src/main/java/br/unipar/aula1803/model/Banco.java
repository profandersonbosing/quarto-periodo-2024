/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1803.model;

import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public class Banco {
    
    private int codigo;
    private String nome;
    //Cria instancia do arraylist ao criar o objeto banco
    private ArrayList<Agencia> listaAgencias = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Agencia> getListaAgencias() {
        return listaAgencias;
    }

    public void setListaAgencias(ArrayList<Agencia> listaAgencias) {
        this.listaAgencias = listaAgencias;
    }
    
    public void addAgencia(Agencia a) {
        this.listaAgencias.add(a);
    }
    
    @Override
    public String toString() {
        return "Banco{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
}
