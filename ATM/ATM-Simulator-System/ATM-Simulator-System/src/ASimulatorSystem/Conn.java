package ASimulatorSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bankmanagementsystem", "postgres", "3223");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
