/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;

/**
 *
 * @author HP
 */
public class test{
    public static void main(String[] args) {
        Connection con = ConnectionProvider.getCon();
        if (con != null) {
            System.out.println("✅ Database Connected Successfully!");
        } else {
            System.out.println("❌ Database Connection Failed!");
        }
    }
}

    
