package moonaz;
import java.sql.*;

public class Login extends access {
  static Connection con=null;
  static ResultSet rs=null;
  static Statement stmt=null;
    public Login(String id ,String pasward){
       super(id, pasward);
    }
    public int loogin  ()
    {
        int k=0;
        String nam;
        String pass;
        nam=id;
        pass=pasward;

           try{
           con=dbc.con();
           stmt = con.createStatement();
               rs = stmt.executeQuery("select * from login");
               while (rs.next()){
                if (nam .equals(rs.getString(2)) && pass.equals(rs.getString(3))){
               // System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                k=rs.getInt(1);
                break;
              }
           } //con.close();
       } catch (Exception e) {
           System.out.println(e);
       }
       if(k!=0)
        System.out.println("Login Successful");
        if(k==0)
        System.out.println("Login Failed");
    
        return k;
      }
}