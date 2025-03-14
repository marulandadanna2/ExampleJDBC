/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.bd;

import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Fecha: 13/03/2025
 * @author Danna
 * Objetivo: Permite consultas y transacciones en la tabla key
 */
public class DBKey extends DBConnection{
    
    public void insert (Key key)
    {
        try {
            connect();
            String sql = "insert into `key` (id, name, room, count, observation) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, key.getId());
            preparedStatement.setString(2, key.getName());
            preparedStatement.setString(3, key.getRoom());
            preparedStatement.setInt(4, key.getCount());
            preparedStatement.setString(5, key.getObservation());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al insertar informacion" + e.getMessage());
        }
        finally{
            disconnect();
        }
    }
    
}
