/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ex1;

/**
 *
 * @author andersonbosing
 */
public class Ex1 {

    public static void main(String[] args) {
        
        //Cria um objeto, instancia um novo objeto
        Camera canon = new Camera();
        canon.lente = "52 mm";
        canon.marca = "Canon";
        canon.megapixels = 200;
        canon.modelo = "Z400";
        canon.qtdArmazenamento = 256;
        canon.qtdBateria = 4000;
        canon.stTemFlash = true;
        canon.zoom = 200;
        
        Camera tekpix = new Camera();
        tekpix.lente = "50 mm";
        tekpix.marca = "tekpix";
        tekpix.megapixels = 200;
        tekpix.modelo = "ABC";
        tekpix.qtdArmazenamento = 256;
        tekpix.qtdBateria = 4000;
        tekpix.stTemFlash = true;
        tekpix.zoom = 200;
        
        canon.imprimir();
        tekpix.imprimir();
        
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        
        Gato gato = new Gato();
        gato.idade = 1;
        gato.nome = "frajola";
        gato.peso = 1;
        gato.stCastrado = true;
        
        gato.miar();
        
        
    }
}
