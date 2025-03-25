/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.model;

/**
 *
 * @author Danna
 */
public class Record {
    private int id;
    private String date_record;
    private String start_time;
    private String end_time;
    private Employee employee;
    private Key key;
    private String status;

    public Record() {
    }

    public Record(int id, String date_record, String start_time, String end_time, Employee employee, Key key, String status) {
        this.id = id;
        this.date_record = date_record;
        this.start_time = start_time;
        this.end_time = end_time;
        this.employee = employee;
        this.key = key;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_record() {
        return date_record;
    }

    public void setDate_record(String date_record) {
        this.date_record = date_record;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
