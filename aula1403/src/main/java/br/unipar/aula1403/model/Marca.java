package br.unipar.aula1403.model;

/**
 *
 * @author andersonbosing
 */
public class Marca {
    
    private String razaoSocial;
    private String nomeFantasia;
    private Endereco endereco;
    private String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Marca{" + "razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", endereco=" + endereco + ", cnpj=" + cnpj + '}';
    }
    
    
    
}
