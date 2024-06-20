/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.provapoo2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andersonbosing
 */
//Questão 2
public class ConnectionFactory {
    
    //metodo que retorna uma connection
    public Connection getConnection() throws SQLException  {
        //Desenvolva esta parte
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/prova", 
                "unipar",
                "unipar");
    }
    
}
