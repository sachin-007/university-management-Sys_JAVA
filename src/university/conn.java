package university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
//            Class.forName("com.mysql.jdbc.Driver");  
        	Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///ums","root","");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
