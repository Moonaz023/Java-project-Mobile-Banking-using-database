package moonaz;
import java.sql.*;

public class cashout implements operation {
  static Connection con = null;
  static ResultSet rs = null;
  static ResultSet rs2 = null;
  static Statement stmt = null;
  static Statement stmt2 = null;

  public int withdrawmoney(String filepath, String editTerm, int bal, int stat,int way,String receive) {
    //System.out.println("editterm=" + editTerm);
    int ok = 0;
    //String receive=null;
    try {
      con = dbc.con();
      stmt = con.createStatement();
      rs = stmt.executeQuery(filepath);

      while (rs.next()) {
        String ID = rs.getString(2);
        // System.out.println(ID);
        if (ID.equals(editTerm)) {
          //
          int new_bal = rs.getInt(4);
          // System.out.println(new_bal);

          if (stat == 1) {

            new_bal = new_bal - bal;
            if (new_bal >= 0) {
              stmt2 = con.createStatement();
              stmt2.executeUpdate("UPDATE login SET balence=" + new_bal + " WHERE number=" + editTerm);
              stmt2.executeUpdate("INSERT INTO history(send,method,ammount,receive) VALUES ('"+editTerm+"',"+way+","+bal+",'"+receive+"')");
              ok = 1;
              //System.out.println("problem try state1");
              break;
            } else {
              System.out.println("insufficient balance xxx");
              ok = 0;
            }
          }
          if (stat == 2) {

            new_bal=new_bal + bal;
            stmt2 = con.createStatement();
              stmt2.executeUpdate("UPDATE m_acc SET balence=" + new_bal + " WHERE number=" + editTerm);
           // System.out.println("problem try state2");
          }
          if (stat == 3) {

            new_bal=new_bal + bal;
            stmt2 = con.createStatement();
              stmt2.executeUpdate("UPDATE login SET balence=" + new_bal + " WHERE number=" + editTerm);
           // System.out.println("problem try state2");
          }

        }
      }con.close();
    } catch (Exception e) {
      System.out.println(e);
      //System.out.println("problem here");

    }
    return ok;
  }

}