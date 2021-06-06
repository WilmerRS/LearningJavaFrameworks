package com.jspbd.jsp_db_1.docente;


public class DocenteModel {
    private String id;
    private String nombre;
    private String apellido;
    private String fecha;
    private float salario;

    public DocenteModel(String id, String nombre, String apellido, String fecha, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public float getSalario() {
        return salario;
    }
}
