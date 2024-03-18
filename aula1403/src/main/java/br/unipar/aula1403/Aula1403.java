package br.unipar.aula1403;

import br.unipar.aula1403.model.Carro;
import br.unipar.aula1403.model.Endereco;
import br.unipar.aula1403.model.Marca;
import br.unipar.aula1403.model.Modelo;
import br.unipar.aula1403.model.Pessoa;
import javax.swing.JOptionPane;

public class Aula1403 {

    public static void main(String[] args) {
        
        Endereco enderecoProprietario = new Endereco();
        enderecoProprietario.setCep("85920-000");
        enderecoProprietario.setCidade("Toledo");
        enderecoProprietario.setNmRua("Avenida Parigot de souza, Centro");
        enderecoProprietario.setNrCasa(450);
        enderecoProprietario.setUf("PR");
        
        Endereco enderecoMarca = new Endereco();
        enderecoMarca.setCep("87829-987");
        enderecoMarca.setCidade("Cascavel");
        enderecoMarca.setNmRua("Rua das Orquideas, Centro");
        enderecoMarca.setNrCasa(900);
        enderecoMarca.setUf("PR");
        
        Marca marca = new Marca();
        marca.setCnpj("01.002.658/0001-03");
        marca.setNomeFantasia("Unipar - Universidade Paranaense");
        marca.setRazaoSocial("Associação Parananese de Ensino");
        marca.setEndereco(enderecoMarca);
        
        Modelo modelo = new Modelo();
        modelo.setMarca(marca);
        modelo.setNmModelo("Polo");
        
        Pessoa proprietario = new Pessoa();
        proprietario.setDocumentoUnico("345.510.370-79");
        proprietario.setEstadoCivil("Casado");
        proprietario.setNome("Professor Anderson");
        proprietario.setNrCnh("16254060848");
        proprietario.setTelefone("(45) 99999-9999");
        proprietario.setEndereco(enderecoProprietario);
        
        Carro carro = new Carro();
        carro.setAnoFabricacao(2023);
        carro.setChassi("5435345345435345");
        carro.setCor("Prata");
        carro.setIsBlindado(true);
        carro.setModelo(modelo);
        carro.setPlaca("AAAA-111");
        carro.setPotencia(1.0);
        carro.setRenavam(4534);
        carro.setValor(120.000);
        carro.setProprietario(proprietario);
        
        System.out.println(carro.toString());
        
    }
}
