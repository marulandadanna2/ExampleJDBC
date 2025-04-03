/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class KeyController implements IKeyController {

    private DBKey dbk = new DBKey();

    @Override
    public void insert(Key key) throws Exception {
        if (key == null) {
            throw new Exception("El tipo de llave es nulo");
        }
        if ("".equals(key.getName())) {
            throw new Exception("El nombre es obligatorio");
        }

        if ("".equals(key.getRoom())) {
            throw new Exception("La sala es obligatoria");
        }

        if ("".equals(key.getCount())) {
            throw new Exception("El numero de llaves es obligatorio");
        }

        //insertar
        dbk.insert(key);
    }

    @Override
    public void update(Key key) throws Exception {
        if (key == null) {
            throw new Exception("El tipo de llave es nulo");
        }

        if (key.getId() == 0) {
            throw new Exception("El id es obligatorio");
        }
        if ("".equals(key.getName())) {
            throw new Exception("El nombre es obligatorio");
        }

        if ("".equals(key.getRoom())) {
            throw new Exception("La sala es obligatoria");
        }

        if ("".equals(key.getCount())) {
            throw new Exception("El numero de llaves es obligatorio");
        }

        //consultar si el key existe en la bd
        Key keyExist = dbk.finById(key.getId());
        if (keyExist == null) {
            throw new Exception("El tipo de llave no existe");
        }

        //actualizar
        dbk.update(key);
    }

    @Override
    public void delete(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El id es obligatorio");
        }
        //consultar si el key existe en la bd
        Key keyExist = dbk.finById(id);
        if (keyExist == null) {
            throw new Exception("El tipo de llave no existe");
        }

        //Eliminar
        dbk.delete(id);
    }

    @Override
    public List<Key> findAll() throws Exception {
        return dbk.findAll();
    }

    @Override
    public Key finById(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El id es obligatorio");
        }
        return dbk.finById(id);
    }

}
