/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1403.model;

/**
 *
 * @author andersonbosing
 */
public class Pessoa {
    
    private String nome;
    private String documentoUnico;
    private String telefone;
    private String estadoCivil;
    private String nrCnh;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoUnico() {
        return documentoUnico;
    }

    public void setDocumentoUnico(String documentoUnico) {
        this.documentoUnico = documentoUnico;
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

    public String getNrCnh() {
        return nrCnh;
    }

    public void setNrCnh(String nrCnh) {
        this.nrCnh = nrCnh;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", documentoUnico=" + documentoUnico + ", telefone=" + telefone + ", estadoCivil=" + estadoCivil + ", nrCnh=" + nrCnh + ", endereco=" + endereco + '}';
    }

    
    
    
    
}
