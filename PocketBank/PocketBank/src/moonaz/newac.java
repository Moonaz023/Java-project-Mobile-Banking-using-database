package moonaz;
import java.sql.*; 

//import java.util.Scanner;

public  class  newac 
{   static Connection con = null;
    static ResultSet rs = null;
    static Statement stmt = null;
    static Statement stmt2 = null;
    public  void newacc(String number,String pasward) {
      /*   Scanner scn =new Scanner(System.in);
      System.out.println("enter number");
      String number=scn.nextLine();
      System.out.println("enter passward");
      String pasward=scn.nextLine();*/
      int key=0;

      try {
        con = dbc.con();
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from login");
        while (rs.next()) {
          if(rs.getString(2).equals(number)){
            key=1;
             break;
          }
        }
        if(key==0){
        stmt2 = con.createStatement();
        stmt2.executeUpdate("INSERT INTO login(number,password,balence) VALUES ('"+number+"','"+pasward+"',0)");
        System.out.println("Account created successfully");
        }else{
            System.out.println("Already have an account");
        }
          
      } catch (Exception e) {
          System.out.println(e);
          
      } 
    }
}
