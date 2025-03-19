/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.bd;

import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            String sql = "insert into `key` ( name, room, count, observation) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.setInt(1, key.getId());
            preparedStatement.setString(1, key.getName());
            preparedStatement.setString(2, key.getRoom());
            preparedStatement.setInt(3, key.getCount());
            preparedStatement.setString(4, key.getObservation());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al insertar datos" + e.getMessage());
            
        }
        finally{
            disconnect();
        }
    }
    public void update (Key key)
    {
        try {
            connect();
            String sql = "update `key` set name = ?,  room = ?,  count = ?,  observation = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, key.getName());
            preparedStatement.setString(2, key.getRoom());
            preparedStatement.setInt(3, key.getCount());
            preparedStatement.setString(4, key.getObservation());
            preparedStatement.setInt(5, key.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al actualizar datos" + e.getMessage());
        }
        finally{
            disconnect();
        }
        
    }
    
    public void delete(int id)
    {
        try {
            connect();
            String sql = "delete from `key`where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al eliminar datos" + e.getMessage());
        }
        finally{
            disconnect();
        }
    }
}
