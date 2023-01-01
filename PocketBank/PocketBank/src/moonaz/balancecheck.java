package moonaz;
import java.sql.*;
public class balancecheck {

  static Connection con=null;
  static ResultSet rs=null;
  static Statement stmt=null;
    public static void balance (int id)
    { 
         try{
         con=dbc.con();
         stmt = con.createStatement();
             rs = stmt.executeQuery("select balence from login where si="+id);
             while (rs.next()){
              System.out.println("Current balance is "+rs.getInt("balence"));  
         }con.close();
     } catch (Exception e) {
         System.out.println(e);
     }
      
    }
    }
    

