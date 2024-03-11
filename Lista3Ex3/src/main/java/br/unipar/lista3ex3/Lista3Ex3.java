/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.lista3ex3;

import br.unipar.lista3ex3.model.Televisor;

/**
 *
 * @author andersonbosing
 */
public class Lista3Ex3 {

    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.setMarca("Samsung");
        tv.setNumeroCanais(2);
        tv.setVolumeMaximo(2);
        //tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        
        System.out.println(tv.toString());
    }
}
