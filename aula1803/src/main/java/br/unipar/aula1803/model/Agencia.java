/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1803.model;

/**
 *
 * @author andersonbosing
 */
public class Agencia {
    
    private String codigo;
    private String nome;
    private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome=").append(nome);
        sb.append(", endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }
    
}
