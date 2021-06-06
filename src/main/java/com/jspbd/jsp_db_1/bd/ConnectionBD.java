package com.jspbd.jsp_db_1.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionBD {
    private final String PASSWORD = "12345";
    private final String USER = "postgres";
    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://localhost:5432/Taller-3-BDII-2021";

    private Connection connection;

    public ConnectionBD() {
        // connect();
    }

    public void connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Contectó ------------------- ");
        } catch (Exception e) {
            System.out.println("Error al conectar " + e);
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void disconnect() {

    }

    /*public static void main(String[] args) {
        ConnectionBD c = new ConnectionBD();
        Statement s;
        ResultSet r;

        try {
            s = c.getConnection().createStatement();
            r = s.executeQuery("Select nombre from docente");
            while (r.next()) {
                System.out.println(r.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println("Contectó ------------------- ");
    }*/
}
