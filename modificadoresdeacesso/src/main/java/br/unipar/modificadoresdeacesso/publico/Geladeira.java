/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.modificadoresdeacesso.publico;

/**
 *
 * @author andersonbosing
 */
public class Geladeira {
    
    private boolean ligado;
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
       ligado = false; 
    }
    
    public void imprimir() {
        System.out.println("Geladeira ligada? "+ ligado);
    }
    
}
