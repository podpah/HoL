package com.example.hol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecords {

    private Connection connect() {
        String url = "jdbc:sqlite:D:\\Programming\\Saves\\Java\\HoL\\src\\main\\java\\com\\example\\hol\\sqlite\\scoreb.db";//Windows
        //url = "jdbc:sqlite:/Users/dobu/IdeaProjects/HoL/src/main/java/com/example/hol/sqlite/scoreb.db";  //Mac
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void insert(String name, int score) {
        String sql = "INSERT INTO scoreboard(name, score) VALUES(?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        InsertRecords app = new InsertRecords();
        //appe.insert("Podpah", 70); appe.insert("Also Podpah", 62);  appe.insert("Also Also Podpah", 49);

    }

}