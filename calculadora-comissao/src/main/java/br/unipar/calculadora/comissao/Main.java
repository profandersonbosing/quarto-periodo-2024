/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.calculadora.comissao;

import br.unipar.calculadora.comissao.models.CalculadoraComissao;
import br.unipar.calculadora.comissao.models.Colaborador;
import br.unipar.calculadora.comissao.models.Diretor;
import br.unipar.calculadora.comissao.models.Funcionario;
import br.unipar.calculadora.comissao.models.Gerente;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
        
        Colaborador c = new Colaborador();
        c.setCodigo(1);
        c.setNome("Anderson");
        c.setSalario(1100);
        
        Gerente g = new Gerente();
        g.setCodigo(2);
        g.setNome("Fernando");
        g.setSalario(5000);
        
        Diretor d = new Diretor();
        d.setCodigo(3);
        d.setNome("Marcelo");
        d.setSalario(10000);
        
        //Funcionario p = new Funcionario();
        //p.setCodigo(4);
        //p.setNome("Anderson Bosing");
        //p.setSalario(15.0);
        
        
        CalculadoraComissao calc = new CalculadoraComissao();
        calc.calcularComissaoExibir(c);
        calc.calcularComissaoExibir(g);
        calc.calcularComissaoExibir(d);
        System.out.println(c.retornaTratamento());
        System.out.println(g.retornaTratamento());
        System.out.println(d.retornaTratamento());
        
    }
}
