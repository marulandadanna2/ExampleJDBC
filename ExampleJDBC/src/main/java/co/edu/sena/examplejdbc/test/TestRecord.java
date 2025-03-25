/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBEmployee;
import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.bd.DBRecord;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.model.Record;

/**
 *
 * @author Danna
 */
public class TestRecord {
    public static void main(String[] args) {
        DBRecord dbr = new DBRecord();
        DBEmployee dbe = new DBEmployee();
        DBKey dbk = new DBKey();
        
        //INSERTAR 
        Employee  employee = dbe.findById(13);
        Key key = dbk.finById(1);
        Record record = new Record(5, "2025-03-04", "07:08:09", "12:00:00", employee, key, "PENDIENTE");
        dbr.insert(record);
    }
}

