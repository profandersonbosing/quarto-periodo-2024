/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.heranca;

import br.unipar.heranca.model.Aluno;
import br.unipar.heranca.model.Pessoa;
import br.unipar.heranca.model.Professor;
import java.util.Date;

public class Heranca {

    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setMatricula(12259);
        professor.setNome("Professor Anderson");
        professor.setIdade("32");
        professor.setSexo("M");
        professor.setCpf("34234234324234234");
        professor.setDtNascimento(new Date("2023-02-01"));
        
        Aluno aluno = new Aluno();
        aluno.setCpf("32423423423423423");
        aluno.setRegistroAcademico("3017221");
        
        //Pessoa pessoa = new Pessoa();
        
        
    }
}
