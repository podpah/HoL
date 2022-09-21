package com.example.hol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Programming\\Saves\\Java\\HoL\\src\\main\\java\\com\\example\\hol\\sqlite\\scoreb.db";    //Windows
        url = "jdbc:sqlite:/Users/dobu/IdeaProjects/HoL/src/main/java/com/example/hol/sqlite/scoreb.db";  //Mac

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS scoreboard (\n"
                + " id integer PRIMARY KEY,\n"
                + " name text NOT NULL,\n"
                + " score integer\n"
                + ");";

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewTable();
    }

}
