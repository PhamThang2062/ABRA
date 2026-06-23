/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dht.quizappv2;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            //BUOC 1: NAP DRIVER
//            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //B2: MO KET NOI
//            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/quizdb","root","root");
            
            //B3 : TRUY VAN 
            String sql= "SELECT * FROM category";
            Statement stm= conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
               int id= rs.getInt("id");
               String name= rs.getString("name");
               System.out.printf("%d-%s\n",id,name);
            }
            //B4 DONG KET NOI 
//            conn.close();
            
            
    
    }    
    
}
