package cl.ptf.taller6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = ConnectionManager.obtenerConexion();

        PreparedStatement ps = conn.prepareStatement("select nombre from planeta");
        ResultSet rs = ps.executeQuery();
        while( rs.next()){
            System.out.println(rs.getString("nombre"));
        }
    }
}
