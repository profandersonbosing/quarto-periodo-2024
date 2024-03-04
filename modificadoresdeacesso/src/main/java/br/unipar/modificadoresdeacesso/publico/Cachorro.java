/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.modificadoresdeacesso.publico;

/**
 *
 * @author andersonbosing
 */
public class Cachorro {
    
    private String nome;
    private int idade;
    private String dono;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void latir() {
        System.out.println(nome+" está latindo = au au au");
    }
    
}
