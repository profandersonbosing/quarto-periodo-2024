/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.banco2024;

import br.unipar.banco2024.enums.TipoContaEnum;
import br.unipar.banco2024.interfaces.BancoInterface;
import br.unipar.banco2024.models.Conta;
import br.unipar.banco2024.models.Correntista;
import br.unipar.banco2024.models.PicPayImp;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
        
        Correntista c = new Correntista();
        c.setCpfCnpj("44324324234234");
        c.setDtNascimento("12-04-2023");
        c.setId(1);
        c.setNome("anderson");
        
        Conta conta = new Conta();
        conta.setCorrentista(c);
        conta.setDsNomeBanco("Pic Pay");
        conta.setNrConta(121221);
        conta.setTpConta(TipoContaEnum.CONTA_POUPANCA);
        conta.setVlSaldo(3000);
        
        PicPayImp picPay = new PicPayImp();
        System.out.println(picPay.extrato(conta));
        
    }
}
