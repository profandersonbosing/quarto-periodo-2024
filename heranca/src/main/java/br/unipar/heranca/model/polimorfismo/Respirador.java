/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.heranca.model.polimorfismo;

/**
 *
 * @author andersonbosing
 */
public class Respirador {
    
    public void respirarCachorro(Cachorro cachorro){
        cachorro.respirar();
    }
    
    public void respirarPeixe(Peixe peixe){
        peixe.respirar();
    }
    
    public void respirar(Animal animal) {
        
        if (animal instanceof Cachorro) {
            animal.respirar();
        }
        
        if (animal instanceof Peixe) {
            System.out.println("Animal é um peixe");
        }
        
        animal.setNome("blablablabla");
    }
    
}
