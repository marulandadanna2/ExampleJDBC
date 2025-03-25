/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.bd;

import static co.edu.sena.examplejdbc.bd.DBConnection.connection;
import co.edu.sena.examplejdbc.model.Record;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Aprendiz
 */
public class DBRecord extends DBConnection{
     public void insert(Record record)
    {
        try {
            connect();
            
            String sql = "INSERT INTO record VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            int pos = 0;
            stmt.setInt(++pos, record.getId());
            stmt.setString(++pos, record.getDate_record());
            stmt.setString(++pos, record.getStart_time());
            stmt.setString(++pos, record.getEnd_time());
            stmt.setLong(++pos, record.getEmployee().getEmployeeType().getId()); // FK: Llave foranea
            stmt.setInt(++pos, record.getKey().getId()); // FK: Llave foranea
            stmt.setString(++pos, record.getStatus());
            stmt.executeUpdate();
            stmt.close();
            
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al insertar tipo de empleado" + e.getMessage());
        }
        finally{
            disconnect();
        }
    }
    
}


    
    