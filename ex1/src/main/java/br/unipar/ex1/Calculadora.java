package br.unipar.ex1;

/**
 *
 * @author andersonbosing
 */
public class Calculadora {
    
    //Modificador de acesso = public por padrão
    //Tipo de retorno = Double
    public Double somar(Double valor1, Double valor2){
        
        Double resultado = valor1 + valor2;
        return resultado;
        
        //return valor1 + valor2;
    }
    
    public Double subtrair(Double v1, Double v2, Double v3) {
        return v1 - v2 - v3;
    }
    
    public String concatenarPalavras(String nome, String sobrenome) {
        
        return nome + " " + sobrenome;
        
    }
    
}
