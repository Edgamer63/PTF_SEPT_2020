package cl.ptf.taller6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection = null;
    private static String connectionString = "jdbc:postgresql://forgedb.netbyteoss.com:5443/forge_alumnos";

    public static Connection obtenerConexion() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(connectionString, "alumno1", "alumno.01");
        }
        return connection;
    }
}
