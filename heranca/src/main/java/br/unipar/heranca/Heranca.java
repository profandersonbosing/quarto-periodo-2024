/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.heranca;

import br.unipar.heranca.model.herancasimples.Aluno;
import br.unipar.heranca.model.herancasimples.Pessoa;
import br.unipar.heranca.model.herancasimples.Professor;
import br.unipar.heranca.model.polimorfismo.Cachorro;
import br.unipar.heranca.model.polimorfismo.Peixe;
import br.unipar.heranca.model.polimorfismo.Respirador;
import java.util.Date;

public class Heranca {

    public static void main(String[] args) {
        
//        Professor professor = new Professor();
//        professor.setMatricula(12259);
//        professor.setNome("Professor Anderson");
//        professor.setIdade("32");
//        professor.setSexo("M");
//        professor.setCpf("34234234324234234");
//        professor.setDtNascimento(new Date());
//        
//        Aluno aluno = new Aluno();
//        aluno.setCpf("32423423423423423");
//        aluno.setRegistroAcademico("3017221");
//        
//        //Pessoa pessoa = new Pessoa();
//        professor.metodoDaSuperClasse();
//        aluno.metodoDaSuperClasse();
        Peixe p = new Peixe();
        p.setIdade(1);
        p.setNome("Nemo");
        p.setPeso(12.0);
        
        Cachorro c = new Cachorro();
        c.setIdade(2);
        c.setNome("Hunter");
        c.setPeso(15.0);
        
        Respirador respirador = new Respirador();
        //respirador.respirarCachorro(c);
        //respirador.respirarPeixe(p);
        respirador.respirar(c);
        respirador.respirar(p);

        System.out.println(c.getNome());
        System.out.println(p.getNome());
        
    }
}
