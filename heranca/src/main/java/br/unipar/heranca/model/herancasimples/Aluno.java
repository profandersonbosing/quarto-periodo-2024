/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.heranca.model.herancasimples;

import java.util.Date;

/**
 *
 * @author andersonbosing
 */
             //Sub        //Super
public class Aluno extends Pessoa {

    public Aluno() {
    }
    
    private String registroAcademico;

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
    @Override
    public void metodoDaSuperClasse(){
        super.metodoDaSuperClasse();
        System.out.println("aluno teste");
    }

    @Override
    public String toString() {
        return "Aluno{" + "registroAcademico=" + registroAcademico + '}';
    }
    
    
    
}
