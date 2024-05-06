/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.banco2024.models;

/**
 *
 * @author andersonbosing
 */
public class Correntista {
    
    private long id;
    private String nome;
    private String cpfCnpj;
    private String dtNascimento;

    public Correntista() {
    }

    public Correntista(long id, String nome, String cpfCnpj, String dtNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.dtNascimento = dtNascimento;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Correntista{" + "id=" + id + ", nome=" + nome + ", cpfCnpj=" + cpfCnpj + ", dtNascimento=" + dtNascimento + '}';
    }
    
}
