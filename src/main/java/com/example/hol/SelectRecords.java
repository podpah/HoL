package com.example.hol;

import java.sql.*;

public class SelectRecords {

    static int[] res;

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Programming\\Saves\\Java\\HoL\\src\\main\\java\\com\\example\\hol\\sqlite\\scoreb.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll() {
        String sql = "SELECT * FROM scoreboard";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getInt("score"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getVals() {

        String sql = "SELECT score FROM scoreboard"; //Was having trouble getting just the numbers data because

        res = new int[3];

        int i = 0;

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                //System.out.println(rs.getInt("score"));
                res[i] = rs.getInt("score");
                System.out.println(res[i]);
                i++;

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

     public void changeVals1(String nam, int scor, int idd) { //This is to update queries

        String sql = "";

        if (idd == 3) {

            sql = "UPDATE scoreboard SET name = '" + nam + "', score = " + scor + " WHERE id=" + idd ; //Was having trouble getting just the numbers data because

            try {
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }

        else if (idd == 2) {

            sql = "SELECT * FROM scoreboard WHERE id=2";
            String  sql2 = "UPDATE scoreboard SET name ='" + nam + "', score= " + scor + " WHERE id= "  +idd;;

            try {
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                String sql3 = "UPDATE scoreboard SET name = '" + rs.getString("name") + "', score = " + rs.getInt("score") + " WHERE id=3";

                ResultSet rs2 = stmt.executeQuery(sql3);

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            try{ //Took me ages to figure this one out but I couldn't run two updates in the same try so I had to run two different tries
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql2);
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }

        }

        else if (idd == 1) {

            sql = "SELECT * FROM scoreboard WHERE id=1";
            String sql4 = "SELECT * FROM scoreboard WHERE id=1";
            String  sql2 = "UPDATE scoreboard SET name ='" + nam + "', score= " + scor + " WHERE id= "  +idd;;

            try {
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                String sql3 = "UPDATE scoreboard SET name = '" + rs.getString("name") + "', score = " + rs.getInt("score") + " WHERE id=2";

                ResultSet rs2 = stmt.executeQuery(sql3);

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            try{ //Took me ages to figure this one out but I couldn't run two updates in the same try so I had to run two different tries
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql2);
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }

            try{
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs3 = stmt.executeQuery(sql4);
                changeVals1(rs3.getString("name"),rs3.getInt("score"),2);
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }

        }

    }

    public void deleteDb() {
        String sql = "DELETE FROM scoreboard";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main (String[]args){
        InsertRecords appe = new InsertRecords();
        appe.insert("Pedro", 97);
        appe.insert("Also Pedro", 82);
        appe.insert("Also Also Pedro", 70);

        SelectRecords app = new SelectRecords();
        app.selectAll();
        //app.getVals();
        app.changeVals1("Jordan", 87, 2);
        app.selectAll();
        app.deleteDb();
    }

}