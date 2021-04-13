package dao;
 
import java.sql.*;

import data.user;
 
public class UserDao {
 
    public user checkLogin(String Kayttajanimi, String Salasana) throws SQLException,
            ClassNotFoundException {
        String jdbcURL = "jdbc:mysql://localhost:3306/vaalikone";
        String dbUser = "topi";
        String dbPassword = "assmen123";
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT * FROM ehdokkaat WHERE Kayttajanimi = ? and Salasana = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, Kayttajanimi);
        statement.setString(2, Salasana);
        
 
        ResultSet result = statement.executeQuery();
 
        user user= null;
 
        if (result.next()) {
            user = new user();
            user.setKayttajanimi(result.getString("Kayttajanimi"));
            user.setSalasana(Salasana);
            
        }
 
       
 
        return user;
    }
}