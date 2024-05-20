/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aulaexceptions;

import br.unipar.aulaexceptions.exceptions.SomaException;

/**
 *
 * @author andersonbosing
 */
public class Calculadora {
    
    public double somar(double a, double b) throws SomaException {
        
        if (a <= 0) {
            throw new SomaException();
        }
        
        return a + b;
        
    }
    
}
