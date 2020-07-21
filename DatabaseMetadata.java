// DatabaseMetaData interface provides methods to get meta data of a database such as database product name, 
// database product version, driver name, name of total number of tables, name of total number of views etc.
import java.sql.*;

class DbMD {
    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/testdb","root","root");  
            DatabaseMetaData dbmd=con.getMetaData();  
            
            System.out.println("Driver Name: "+dbmd.getDriverName());  
            System.out.println("Driver Version: "+dbmd.getDriverVersion());  
            System.out.println("UserName: "+dbmd.getUserName());  
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
            
            con.close();  
        }catch(Exception e){ System.out.println(e);} 
    }
}