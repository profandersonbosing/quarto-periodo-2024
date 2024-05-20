/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.aulaexceptions.exceptions;

/**
 *
 * @author andersonbosing
 */
public class SomaException extends Exception {

    public SomaException() {
        super("Não é possivel somar valores menores ou iguais a zero");
    }
    
}
