/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista3ex02.model;

/**
 *
 * @author andersonbosing
 * 
 * Escreva um código em Java que apresente a classe Geladeira, 
 * com os atributos ligado e portaFechada e imprimir. 
Criar os métodos ligarGeladeira, desligarGeladeira, abrirPorta, 
* fecharPorta.
Os métodos ligarGeladeira e desligarGeladeira devem alterar o atributo ligado.
Os métodos abrirPorta e fecharPorta devem altera o atributo portaFechada.
O método imprimir deverá retornar através de uma mensagem ao usuário 
* no console(System.out) os valores de todos os atributos.
Na classe principal do programa java deve-se criar um objeto do tipo 
* Geladeira e realiza as chamadas aos métodos criados e ao final 
* chamar o método imprimir.

 */
public class Geladeira {
    
    private boolean ligado;
    private boolean portaFechada;
    
    //Getters
    public boolean getLigado(){
        return ligado;
    }
    
    public boolean getPortaFechada(){
        return portaFechada;
    }
    
    //Setters
    public void setLigado(boolean estaLigada) {
        ligado = estaLigada;
    }
    
    public void setPortaFechada(boolean estaAberta) {
        portaFechada = estaAberta;
    }
    
    public void ligarGeladeira(){
        ligado = true;
    }
    
    public void desligarGeladeira(){
        ligado = false;
    }
    
    public void abrirPorta(){
        portaFechada = false;
    }
    
    public void fecharGeladeira() {
        portaFechada = true;
    }
    
    public void imprimir(){
        System.out.println("Geladeira ligada ? = "+ligado+
                " A porta está aberta? = "+portaFechada);
    }
    
}
