/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista3ex3.model;

import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 Escreva um código em Java que apresente a classe Televisor, 
 * com atributos ligado, canal, volume, numeroCanais e volumeMaximo e, 
 * os métodos imprimir, aumentarVolume, abaixarVolume, ligar, desligar, 
 * alterarCanalParaCima, alterarCanalParaBaixo, imprimir.
Implementar a lógica dos métodos ligar e desligar para que alterem o 
* atributo ligado. O mesmo deve ser realizado para os métodos aumentarVolume, 
* abaixarVolume, alterarCanalParaCima, alterarCanalParaBaixo.
O método imprimir deverá retornar através de uma mensagem ao usuário no 
* console(System.out) os valores de todos os atributos.
Na classe principal do programa java deve-se criar um objeto do tipo 
* Televisor e realiza as chamadas aos métodos criados e ao final 
* chamar o método imprimir.

 */
public class Televisor {
    
    private String marca;
    private boolean ligado;
    private int canal;
    private int volume;
    private int numeroCanais;
    private int volumeMaximo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getNumeroCanais() {
        return numeroCanais;
    }

    public void setNumeroCanais(int numeroCanais) {
        this.numeroCanais = numeroCanais;
    }

    public int getVolumeMaximo() {
        return volumeMaximo;
    }

    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }
    
    public void aumentarVolume() {
        
        if (!ligado) {
            JOptionPane.showMessageDialog(null, "Para aumentar o volume sua tv precisa "
                    + "estar ligada");
            return;
        }
        
        if (volumeMaximo < (volume + 1)) {
            System.out.println("Sua Tv já está no volume Máximo("+
                    volumeMaximo+")");
            return;
        } 
        
        volume = volume + 1; 
        
    }
    
    public void abaixarVolume(){
        if (ligado)
            volume = volume - 1;
        else 
            System.out.println("Para abaixar o volume sua tv precisa "
                    + "estar ligada");
    }
    
    public void alterarCanalParaBaixo(){
        if (ligado)
            canal = canal - 1;
        else 
          System.out.println("Para alterar os canais sua tv precisa "
                    + "estar ligada");  
    }
    
    public void alterarCanalParaCima(){
        if (ligado)
            canal = canal + 1;
        else 
          System.out.println("Para alterar os canais sua tv precisa "
                    + "estar ligada"); 
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligado(){
        ligado = false;
    }

    @Override
    public String toString() {
        return "Televisor{" + "marca=" + marca + ", ligado=" + ligado + ", canal=" + canal + ", volume=" + volume + ", numeroCanais=" + numeroCanais + ", volumeMaximo=" + volumeMaximo + '}';
    }

    
}
