/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBEmployee;
import co.edu.sena.examplejdbc.model.Employee;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class EmployeeController implements IEmployeeController{

    public static List<Employee> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private DBEmployee dbe = new DBEmployee();

    @Override
    public void insert(Employee employee) throws Exception {
        if(employee == null)
        {
                throw new Exception("El emplelado es nulo");
        }
        
        if(employee.getDocument() == 0)
        {
            throw new Exception("El documento ees obligatorio");
        }
        
        if("".equals(employee.getFullname()))
        {
            throw  new Exception("El nombre es obligatorio");
        }
        
        if("".equals(employee.getAddress()))
        {
            throw new Exception("La direccion es obligatoria");
        }
        
        if("".equals(employee.getPhone()))
        {
            throw new Exception("El telefono es obligatorio");
        }
        
        //FK
        if(employee.getEmployeeType() == null)   
        {
            throw new Exception("El tipo de empleado es obligatorio");
        }
        
        //La FK no es autoincremental se debe validar existencia del emplado
        Employee employeeExist = dbe.findById(employee.getDocument());
        if(employeeExist != null)
        {
            throw new Exception("Ya existe un empleado en ese documento");
        }
        
        dbe.insert(employee);
    }

    @Override
    public void update(Employee employee) throws Exception {
        if(employee == null)
        {
                throw new Exception("El emplelado es nulo");
        }
        
        if(employee.getDocument() == 0)
        {
            throw new Exception("El documento ees obligatorio");
        }
        
        if("".equals(employee.getFullname()))
        {
            throw  new Exception("El nombre es obligatorio");
        }
        
        if("".equals(employee.getAddress()))
        {
            throw new Exception("La direccion es obligatoria");
        }
        
        if("".equals(employee.getPhone()))
        {
            throw new Exception("El telefono es obligatorio");
        }
        
        //FK
        if(employee.getEmployeeType() == null)   
        {
            throw new Exception("El tipo de empleado es obligatorio");
        }
        
        
        Employee employeeExist = dbe.findById(employee.getDocument());
        if(employeeExist == null)
        {
            throw new Exception("No existe un empleado");
        }
        
        dbe.update(employee);
    }

    @Override
    public void delete(long document) throws Exception {
        if(document == 0)
        {
            throw new Exception("El documento ees obligatorio");
        }    
        
        Employee employeeExists = dbe.findById(document);
        if(employeeExists == null)
        {
            throw new Exception("No existe el empleado");
        }
        dbe.delete(document);
     
    }

    @Override
    public List<Employee> FindAll() throws Exception {
        return dbe.FindAll();
    }

    @Override
    public Employee findById(long document) throws Exception {
        if(document == 0)
        {
            throw new Exception("El documento ees obligatorio");
        }
        return dbe.findById(document);
    }
    
}
