package com.example.hol;

import java.sql.*;

public class SelectRecords {

    static int[] res;

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Programming\\Saves\\Java\\HoL\\src\\main\\java\\com\\example\\hol\\sqlite\\scoreb.db";//Windows
        url = "jdbc:sqlite:/Users/dobu/IdeaProjects/HoL/src/main/java/com/example/hol/sqlite/scoreb.db";  //Mac
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll() {
        int fix = 0; //WHY DIDN'T I THINK OF THIS EARLIER
        //InsertRecords aappee = new InsertRecords();
        String sql = "SELECT * FROM scoreboard ORDER BY score DESC LIMIT 3";
        //String sql6= "SELECT name, score, RANK () OVER (ORDER BY score) pos FROM scoreboard";


        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
           //ResultSet rs2 = stmt.executeQuery(sql6);

            // loop through the result set
            while (rs.next()) {
                fix++;
                System.out.println(fix + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getInt("score") );

                //RANK () OVER (ORDER BY score) pos
                //aappee.insert(rs.getString("name"),rs.getInt("score"));
            }
            //ResultSet rs2 = stmt.executeQuery(sql3);
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
                //System.out.println(res[i]);
                i++;

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

     public void changeVals(String nam, int scor) { //This is to update queries

         InsertRecords appee = new InsertRecords();

         String sql = "";

        /*if (idd == 3) {

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

        }*/

         appee.insert(nam,scor);

         /*sql = "SELECT * FROM scoreboard ORDER BY score" ; //Was having trouble getting just the numbers data because

         try {
             Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }*/


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

        //appe.insert("Pedro", 98); appe.insert("Also Pedro", 82);  appe.insert("Also Also Pedro", 70);

        SelectRecords app = new SelectRecords();
        app.selectAll();
        //app.getVals();
        //app.changeVals("Testing", 123);
        app.selectAll();
        //app.deleteDb();
    }

}