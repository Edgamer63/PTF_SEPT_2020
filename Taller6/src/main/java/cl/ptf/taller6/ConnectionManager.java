package cl.ptf.taller6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection conn = null;
    private static String connectionString = "jdbc:postgresql://forgedb.netbyteoss.com:5443/forge_alumnos";

    public static Connection obtenerConexion() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(connectionString, "alumno1", "alumno.01");
        }
        return conn;
    }
}
