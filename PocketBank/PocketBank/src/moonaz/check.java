
package moonaz;
import java.sql.*;

public class check {
  static Connection con=null;
  static ResultSet rs=null;
  static Statement stmt=null;
    public static int find  (String location,String id)
    {
       
      int k=0;

         try{
         con=dbc.con();
         stmt = con.createStatement();
             rs = stmt.executeQuery(location);
             while (rs.next()){
              if (id .equals(rs.getString(2))){
              //System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
              k=rs.getInt(1);
              break;
            }
         }// con.close();
     } catch (Exception e) {
         System.out.println(e);
     }
     //if(k!=0)
      //System.out.println("Login Successful");
     // if(k==0)
      //System.out.println("Wrong Receive account");
  
      return k;
      }
}