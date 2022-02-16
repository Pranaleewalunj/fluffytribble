/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Pranalee
 */
public class SqliteDemo {
    public static void main(String [] args){
        String jdbcUrl="jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3370200\\sqlite-tools-win32-x86-3370200\\Mulesoft.db";
        try{
            Connection connection=DriverManager.getConnection(jdbcUrl);
            Statement statement=connection.createStatement();
            System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Movies VALUES ('Pushpa','Allu Arjun','Rashmika Mandanna','Sukumar',2021)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES ('Main Hoo Na','Shah Rukh Khan','Sushmita Sen','Farah Khan',2004)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES ('Dangal','Aamir Khan','Fatima Shaikh','Mukesh Chhabra',2016)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Bajirao Mastani','Ranveer Singh','Priyanka Chopra','Shruti Mahajan',2015)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Zombivali','Amey Wagh','Vaidehi Parshurami','Aditya Sarpotdar',2022)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Duniyadari','Swapnil Joshi','Sai Tamhankar','Sanjay Jadhav',2013)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Jhimma','Siddharth Chandekar','Sonali Kulkarni','Hemant Dhome',2021)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('ABCD2','Varun Dhawan','Shraddha Kapoor','Remo D Souza',2015)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Sultan','Salman Khan','Anushka Sharma',' Ali Abbas Zafar',2016)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('MS Dhoni-The Untold Story','Sushant Singh','Disha Patani','Neeraj Pandey',2016)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('PK','Aamir Khan','Anushka Sharma','Rajkumar Hirani',2014)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Ghajni','Aamir Khan','Asin','A.R.Murugadoss',2008)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Student of The Year','Varun Dhawan','Alia Bhatt','Karan Johar',2012)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO Movies VALUES('Gully Boy','Ranveer Singh','Alia Bhatt','Zoya Akhtar',2019)";
         statement.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   
            String sql1="SELECT * from Movies";
            
            ResultSet result= statement.executeQuery(sql1);
            System.out.println("Movies Table Details:");
            while(result.next()){
                String m_name=result.getString("m_name");
                String actor=result.getString("actor");
                String actress=result.getString("actress");
                String director=result.getString("director");
                String YearOfRelease=result.getString("YearOfRelease");
                System.out.println(m_name+"|"+actor+"|"+actress+"|"+director+"|"+YearOfRelease);
                
            }
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        System.out.print("Enter Actor Name: ");
        String a = reader.readLine();
        String sql2 = "SELECT m_name FROM Movies" +
        " WHERE actor = '"+a+"'";
        ResultSet result1 = statement.executeQuery(sql2);

         while(result1.next()){
            System.out.println(result1.getString("m_name"));
         }
         result1.close();
        }
        catch(Exception e) {
            System.out.println("Error connecting to SQLite Database");
            e.printStackTrace();
        }
    }
}
