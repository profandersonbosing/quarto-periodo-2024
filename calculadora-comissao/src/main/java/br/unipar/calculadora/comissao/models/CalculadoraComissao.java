/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.calculadora.comissao.models;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraComissao {
    
    public void calcularComissaoExibir(Funcionario func) {
        
        double resultado = 0;
        
        if (func instanceof Colaborador) 
            resultado = func.getSalario() * 1.10;
        
        
        if (func instanceof Gerente) 
            resultado = func.getSalario() * 1.25;  
        
        if (func instanceof Diretor) 
            resultado = func.getSalario() * 1.50;
        
        System.out.println(func.getNome() + " vai receber um salario de "+resultado);
        
    }
    
}
