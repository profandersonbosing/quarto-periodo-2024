package br.unipar.ex1;

/**
 *
 * @author andersonbosing
 */
public class Camera {
    
    String lente;
    int megapixels;
    boolean stTemFlash;
    int zoom;
    String marca;
    String modelo;
    int qtdBateria;
    int qtdArmazenamento;
    
    public void imprimir(){
        System.out.println(lente + " " +megapixels +" "+marca + " " +modelo);
    }
    
}
