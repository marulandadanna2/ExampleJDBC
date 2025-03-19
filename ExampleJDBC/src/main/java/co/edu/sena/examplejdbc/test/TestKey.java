/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class TestKey {
    public static void main(String[] args) {
       DBKey dBkey = new DBKey();
        
       //insertar
       Key key = new Key(6,"DANNA", "SALA INFORMATICA", 3, "LLAVERO CON DOS LLAVES");
       //dBkey.insert(key);
       
       //actualizar
        //key.setId(6);
        //key.setName("SENNOVA");                                                                                           
        //key.setRoom("Aula sennova");
        //key.setCount(1);
        //key.setObservation("Llave sola");
        //dBkey.update(key);
        
        //Eliminar
        //dBkey.delete(8);
        
        //consultar todos 
        //List<Key> listKey = dBkey.findAll();
        //for (Key e : listKey) {
            //System.out.println("id: " + e.getId() + "name: " + e.getName() + "room: " + e.getRoom() + "count: " + e.getCount()
           // + "observation: " + e.getObservation());
            
            
        //Consultar 
            System.out.println("***************************");
            Key key2 = dBkey.finById(2);
            System.out.println("id: " + key2.getId() + "name: " + key2.getName() + "room: " + key2.getRoom() + 
                    "count: " + key2.getClass() + "observation: " + key2.getObservation());
        }
        
        //Consultar por ID
    
    }
    
    
    

