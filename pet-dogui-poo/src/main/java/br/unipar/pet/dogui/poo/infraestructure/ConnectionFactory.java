/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.poo.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andersonbosing
 */
public class ConnectionFactory {
    
    //metodo que retorna uma connection
    public Connection getConnection() throws SQLException  {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/app", //driver:banco:caminho do banco
                "unipar", //usuario do banco
                "unipar123" // senha do banco
        );
    }
    
}
