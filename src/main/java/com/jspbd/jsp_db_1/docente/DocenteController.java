package com.jspbd.jsp_db_1.docente;

import com.jspbd.jsp_db_1.bd.ConnectionBD;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DocenteController {
    private ArrayList<DocenteModel> docentes;

    public DocenteController() {
        this.docentes = new ArrayList<>();
    }

    public ArrayList<DocenteModel> getDocentes() {
        this.getDocentesBD();
        return docentes;
    }

    private void getDocentesBD() {
        ConnectionBD c = new ConnectionBD();
        c.connect();
        Statement s;
        ResultSet r;
        try {
            s = c.getConnection().createStatement();
            r = s.executeQuery("Select id, nombre, apellido, fechanac, salario from docente");

            while (r.next()) {
                String id = r.getString("id");
                String nombre = r.getString("nombre");
                String apellido = r.getString("apellido");
                String fechanac = r.getString("fechanac");
                float salario = r.getFloat("salario");
                DocenteModel dc = new DocenteModel(id, nombre, apellido, fechanac, salario);
                this.docentes.add(dc);
            }
        } catch (Exception e) {
            System.out.println("Error al intentar obtener los docentes: DocenteController.getDocentesBD()");
        }
    }
}
