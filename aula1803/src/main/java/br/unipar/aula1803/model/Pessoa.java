/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1803.model;

/**
 *
 * @author andersonbosing
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String estadoCivil;
    private Endereco enderecoEnvioCartao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public Endereco getEndereco() {
        return enderecoEnvioCartao;
    }

    public void setEndereco(Endereco enderecoEnvioCartao) {
        this.enderecoEnvioCartao = enderecoEnvioCartao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", cpf=").append(cpf);
        sb.append(", telefone=").append(telefone);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append(", endereco=").append(enderecoEnvioCartao);
        sb.append('}');
        return sb.toString();
    }

    
    
}
