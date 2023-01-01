package moonaz;
import java.sql.*; 
import java.util.Scanner;

public class reset{
    //private static Scanner x;
    static Connection con = null;
    static ResultSet rs = null;
    static Statement stmt = null;
    static Statement stmt2 = null;
  
    public static void resetpass (String editTerm)
    {
      Scanner scn =new Scanner(System.in);
      System.out.println("enter new passward");
      String newpas=scn.nextLine();
      System.out.println("Conform with old passward");
      String conformpasward=scn.nextLine();

      try {
        con = dbc.con();
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from login where number="+editTerm);
        while (rs.next()) {
          if(rs.getString(3).equals(conformpasward)){
            stmt2 = con.createStatement();
              stmt2.executeUpdate("UPDATE login SET password=" + newpas + " WHERE number=" + editTerm);
              System.out.println("Passward chanced successfully");
          }
        }
          
      } catch (Exception e) {
          System.out.println(e);
          
      } 
  }
  

}