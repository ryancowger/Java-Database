/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlcommand;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ryan
 */
public class SQLstarter  { 
 public static void main (String[ ] args)  { 
 
try {    		    // start of the try/catch block of code
   String host  = "localhost:3306";   // This value is provided in the instructions for this assignment.                             
   String uName = "student";   // This value is provided in the instructions for this assignment.   
   String uPass = "prg421";   // This value is provided in the instructions for this assignment.  
    
Connection conn = DriverManager.getConnection(host, uName, uPass);                      
Statement stmt = conn.createStatement();                          
  
// Select values from the tables 
String sql = "select  Emp id, FName, LName, Addr, City, State, Zip from Employee_table, Union, select Paysch, 401k, Spouse from Payroll-table;";                                                                                  
ResultSet rs = stmt.executeQuery ("select * from Emp id");            // cursor pointing to its current row of data                        
                                          
System.out.println ("Displaying student information: ");        // display values from the tables
      
String Emp id = rset.getString("Emp id");                      
String FName = rset.getString("FName "); 
String LName = rset.getString("LName "); 
String Addr = rset.getString("Addr ");
String Zip = rset.getString("Zip");
String Paysch = rset.getString("Paysch ");
String 401k = rset.getString("401k");
String Spouse = rset.getString("Spouse”);

// System.out.println (Stu_id  + ",  " +Stu_Name );        
 System.out.println (Emp id  + ",  " +FName  + ”,  “ +LName  + “,  ” +Add  + ”,  “ +Zip  + ”,  “ +Paysch  +”,
  “ +401k + ”,  “+Spouse);                                                                       
                                                               
           }     
catch ( SQLException err ) { 
System.out.println( err.getMessage(  )  ); 
 
} 
System.out.println("My name is Ryan Cowger");

 
} 
 
} 

