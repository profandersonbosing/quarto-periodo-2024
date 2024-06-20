/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.provapoo2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */

//Questão 4
public class ProfessorRepository {
    
    
    private String INSERT
            = "INSERT INTO professor(nome, ativo)VALUES(?, ?);";
   
    private String FIND_ALL
            = "SELECT id, nome, ativo FROM professor;";

    public void insert(Professor prof) throws SQLException {

        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection conn = null;
        
        try {
            //Cria uma nova conexão no banco
            conn = new ConnectionFactory().getConnection();
            //Com base na conexão preparmos a execução da query
            pstm = conn.prepareStatement(INSERT, 
                    Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, prof.getNome());
            pstm.setBoolean(2, prof.isAtivo());
           
            rs = pstm.executeQuery();//Executando a consulta no banco de dados
            
            rs.next();
            
            prof.setId(rs.getInt(0));
            
        } finally {
            if (rs != null)
                rs.close();
            if (pstm != null)
                pstm.close();
            if (conn != null)
                conn.close();
        }
        
    }
   
    public ArrayList<Professor> findAll() throws SQLException {

        ArrayList<Professor> resultado = new ArrayList<>();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection conn = null;
        
        try {
            //Cria uma nova conexão no banco
            conn = new ConnectionFactory().getConnection();
            //Com base na conexão preparmos a execução da query
            pstm = conn.prepareStatement(FIND_ALL);
            rs = pstm.executeQuery();//Executando a consulta no banco de dados
            
            //Percorremos os resultados retornados
            while(rs.next()) {
                Professor prof = new Professor();
                prof.setId(rs.getInt("id"));
                prof.setNome(rs.getString("nome"));
                prof.setAtivo(rs.getBoolean("ativo"));
                resultado.add(prof);
            }
            
        } finally {
            if (rs != null)
                rs.close();
            if (pstm != null)
                pstm.close();
            if (conn != null)
                conn.close();
        }
        
        
        return resultado;
    }
    
}
