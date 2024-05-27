/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.pet.dogui.poo;

import br.unipar.pet.dogui.poo.domain.Cor;
import br.unipar.pet.dogui.poo.exceptions.NegocioException;
import br.unipar.pet.dogui.poo.services.CorService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andersonbosing
 */
public class PetDoguiPoo {

    public static void main(String[] args) {
        
        try {
            CorService corService = new CorService();
            
            Cor c = new Cor();
            c.setDescricao("Violeta");
            
            corService.insert(c);
            
            ArrayList<Cor> resultado = corService.findAll();
            
            System.out.println(resultado.toString());
            
            
        } catch (SQLException ex) {
            System.out.println("Ops, algo deu errado com o banco de dados\n"+ex.getMessage());
        } catch (NegocioException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {    
            System.out.println("Ops, algo deu errado contate o suporte\n"+ex.getMessage());
        }
        
    }
}
