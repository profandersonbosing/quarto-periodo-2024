/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.provapoo2024.ex8;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraBonus {
    
    public void calcularBonus(Funcionario funcionario) {
        
        if (funcionario instanceof Diretor) {
            double resultado = funcionario.getSalario() * 1.25;
            System.out.println("Valor do bonus = "+resultado);
            return;
        }
        
        if (funcionario instanceof Gerente) {
            double resultado = funcionario.getSalario() * 1.15;
            System.out.println("Valor do bonus = "+resultado);
            return;
        }
        
        if (funcionario instanceof Supervisor) {
            double resultado = funcionario.getSalario() * 1.5;
            System.out.println("Valor do bonus = "+resultado);
            return;
        }
        
    }
    
}
