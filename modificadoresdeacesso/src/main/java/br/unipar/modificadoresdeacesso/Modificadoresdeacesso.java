/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.modificadoresdeacesso;

import br.unipar.modificadoresdeacesso.publico.*;

/**
 *
 * @author andersonbosing
 */
public class Modificadoresdeacesso {

    public static void main(String[] args) {
//        Geladeira g = new Geladeira();
//        g.ligar();
//        g.imprimir();
//        g.desligar();
//        g.imprimir();
        Cachorro c = new Cachorro();
        c.setNome("Bob");
        
        String nomeDoDog = c.getNome();
        
        System.out.println(nomeDoDog);
    
    }
}
