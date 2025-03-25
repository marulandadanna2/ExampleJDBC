/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBEmployeeType;
import co.edu.sena.examplejdbc.model.EmployeeType;
import java.util.List;

/**
 * fecha: 25/03/2025
 * @author Danna
 * objetivo: implementar la interface para controlar el modelo EmployeeType
 */
public class EmployeeTypeController implements IEmployeeTypeController{
    
    private DBEmployeeType dbe = new DBEmployeeType();
    

    @Override
    public void insert(EmployeeType employeeType) throws Exception {
        if(employeeType == null)
                {
                 throw new Exception("El tipo de empleado es nulo");
                }
        
        if("".equals(employeeType.getDescript()))
        {
            throw new Exception("La descrpcion es obligatoria");
        }
        
        //insertar
        dbe.insert(employeeType);
    }

    @Override
    public void update(EmployeeType employeeType) throws Exception {
         if(employeeType == null)
                {
                 throw new Exception("El tipo de empleado es nulo");
                }
         
         if(employeeType.getId()==0)
         {
             throw new Exception("El id es obligatorio");
         }
         
        if("".equals(employeeType.getDescript()))
        {
            throw new Exception("La descrpcion es obligatoria");
        }
        
        
        //consultar si el employeeType existe en la bd
        EmployeeType employeeTypeExist = dbe.findById(employeeType.getId());
        if(employeeTypeExist == null)
        {
            throw new Exception("El tipo de empleado no existe");
        }
        
        //actualizar
        dbe.update(employeeType);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        //consultar si el employeeType existe en la bd
        EmployeeType employeeTypeExist = dbe.findById(id);
        if(employeeTypeExist == null)
        {
            throw new Exception("El tipo de empleado no existe");
        }
        
        //Eliminar
        dbe.delete(id);
    }

    @Override
    public List<EmployeeType> findAll() throws Exception {
        return dbe.findAll();

    }

    @Override
    public EmployeeType findById(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        return dbe.findById(id);
    
    }
}
