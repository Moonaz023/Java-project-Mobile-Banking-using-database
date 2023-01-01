package moonaz;
import java.sql.*;

public class historycheck{
  static Connection con=null;
  static ResultSet rs=null;
  static Statement stmt=null;
    public static void history (String id){
    {
       
        String nam;
    
        nam=id;

           try{
           con=dbc.con();
           stmt = con.createStatement();
               rs = stmt.executeQuery("select * from history where send='"+nam+"' or receive='"+nam+"'ORDER BY si DESC");
               while (rs.next()){
                //System.out.println(rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4) + "  " + rs.getString(5) + "  " + rs.getString(6));
                if(rs.getInt(3)==1 && nam.equals(rs.getString(5))){
                System.out.println("received  "+ rs.getInt(4) + " tk from " + rs.getString(2)+ " at " + rs.getString(6));
                }
                if(rs.getInt(3)==1 && nam.equals(rs.getString(2))){
                System.out.println("send  "+ rs.getInt(4) + " tk t0 " + rs.getString(5)+ " at " + rs.getString(6));
                }
                if(rs.getInt(3)==2 && nam.equals(rs.getString(2))){
                System.out.println("cashout  "+ rs.getInt(4) + " tk from " + rs.getString(5)+ " at " + rs.getString(6));
                }
           } //con.close();
       } catch (Exception e) {
           System.out.println(e);
       }
        
      }
}}