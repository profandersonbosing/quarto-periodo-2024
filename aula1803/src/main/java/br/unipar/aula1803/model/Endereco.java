/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aula1803.model;

/**
 *
 * @author andersonbosing
 */
public class Endereco {
    private String nmRua;
    private int nrCasa;
    private String cep;
    private String cidade;
    private String uf;

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Endereco{");
        sb.append("nmRua=").append(nmRua);
        sb.append(", nrCasa=").append(nrCasa);
        sb.append(", cep=").append(cep);
        sb.append(", cidade=").append(cidade);
        sb.append(", uf=").append(uf);
        sb.append('}');
        return sb.toString();
    }
    
}
