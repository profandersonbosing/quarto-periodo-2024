/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aulaexceptions;

import br.unipar.aulaexceptions.exceptions.SomaException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Aulaexceptions {

    public static void main(String[] args) {
        
//        Scanner scan = new Scanner(System.in);
//        try {
//        
//            System.out.println("Digite a Senha:");
//            String senha = scan.next();
//
//            if (!senha.equals("123456")) {
//                throw new Exception("Senha digita é incorreta. Verifique!");
//            }
//            
//            System.out.println("Bem vindo ao sistema");
//        
//        } catch(InputMismatchException ex) {
//            System.out.println("Digite um Valor válido.");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            scan.close();
//            System.out.println("Bloco Finally");
//        }
        
        
        try {
            Calculadora c = new Calculadora();
            double resultado = c.somar(0, 2);
        
            System.out.println(resultado);
        } catch(SomaException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
        
        
//        while (true) {
//            
//            try {
//            
//                System.out.println("Digite o Primeiro Valor a Ser somando:\n");
//                int a = scan.nextInt();
//
//                System.out.println("Digite o Segundo Valor a Ser somando:\n");
//                int b = scan.nextInt();
//
//                System.out.println("A soma dos valores é :"+(a+b));
//            
//            } catch(InputMismatchException ex) {
//                System.out.println("Ocorreu um Problema Ao Receber os "
//                        + "Valores. Digite Apenas Valores para serem"
//                        + " Somados");
//            } catch(Exception ex) {
//                System.out.println("Algo de errado ocorreu. "
//                        + "Contate o Suporte");
//            }
//        
//        }

    
        

}
