package moonaz;
import java.sql.*;
public  class dbc{
    public static Connection con() { 
        Connection con=null;
       //ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pocketbank", "root", "");
            //System.out.println("connected ok");
            //Statement stmt = con.createStatement();
            //rs = stmt.executeQuery("select * from emp");
            //while (rs.next())
       //System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
          
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}