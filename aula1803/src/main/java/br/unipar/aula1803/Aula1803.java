/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aula1803;

import br.unipar.aula1803.model.Agencia;
import br.unipar.aula1803.model.Banco;
import java.util.ArrayList;


/**
 *
 * @author andersonbosing
 */
public class Aula1803 {

    public static void main(String[] args) {
        
        //Um banco possui muitas agencias e estas agencias possuem muitos 
        //correntistas, sendo contas correntes ou contas poupanças.
        //Cada correntista possui um endereço para onde deve ser enviado o cartão.

        ArrayList<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Anderson");
        listaNomes.add("Gabriel");
        listaNomes.add("Willian");
        listaNomes.add("Jailson");
        listaNomes.add("Maccari");
        listaNomes.add("Damy");
        
        System.out.println("Tamanho do meu arraylist = "+listaNomes.size());
        
        ArrayList<Banco> listaBancos = new ArrayList<>();
        
        Banco bancoBrasil = new Banco();
        bancoBrasil.setCodigo(1);
        bancoBrasil.setNome("Banco do Brasil");
        
        listaBancos.add(bancoBrasil);
        
        Banco b = new Banco();
        b.setCodigo(2);
        b.setNome("Nu Bank");
        
        listaBancos.add(b);
        
        System.out.println("");
        
        for (int i = 0; i < listaBancos.size(); i++) {
            System.out.println(listaBancos.get(i).toString());
        }
        
        //for each
        //diz de que tipo é cada elemento : diz qual é a lista
        for (Banco banco : listaBancos) {
            System.out.println(banco.toString());
        }
        
        for (String nome : listaNomes){
            System.out.println(nome);
        }
        
        Agencia a = new Agencia();
        a.setCodigo("aaaa-1");
        a.setNome("Agencia do Centro");
        
        Agencia l = new Agencia();
        l.setCodigo("32424");
        l.setNome("Agencia do Lago");
                
        
        
        bancoBrasil.addAgencia(a);
        bancoBrasil.addAgencia(l);
        
        bancoBrasil.getListaAgencias().add(l);
        
        for(Agencia agencia : bancoBrasil.getListaAgencias()) {
            System.out.println(agencia.toString());
        }
        
        
    }
}
