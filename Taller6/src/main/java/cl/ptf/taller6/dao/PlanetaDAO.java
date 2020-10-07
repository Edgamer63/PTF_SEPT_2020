package cl.ptf.taller6.dao;

import cl.ptf.taller6.ConnectionManager;
import cl.ptf.taller6.dto.Planeta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlanetaDAO {
    private Connection conn;

    public PlanetaDAO() throws SQLException {
        conn = ConnectionManager.obtenerConexion();
    }

    public List<Planeta> obtenerPorNombre(String nombre) throws SQLException {
        String sql = "select id, nombre, periodo_rotacion, periodo_orbital, diametro, clima, gravedad, terreno, agua_superficial, poblacion " +
                "from planeta " +
                "where nombre like ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + nombre + "%");

        List<Planeta> listadoPlanetas = new ArrayList<Planeta>();

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Planeta p = new Planeta(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("periodo_rotacion"),
                    rs.getInt("periodo_orbital"),
                    rs.getInt("diametro"),
                    rs.getString("clima"),
                    rs.getString("gravedad"),
                    rs.getString("terreno"),
                    rs.getString("agua_superficial"),
                    rs.getLong("poblacion"));

            listadoPlanetas.add(p);
        }

        return listadoPlanetas;

    }

    public List<Planeta> obtenerTodos() throws SQLException {
        String sql = "select id, nombre, periodo_rotacion, periodo_orbital, diametro, clima, gravedad, terreno, agua_superficial, poblacion from planeta";
        PreparedStatement ps = conn.prepareStatement(sql);

        List<Planeta> listadoPlanetas = new ArrayList<Planeta>();

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Planeta p = new Planeta(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("periodo_rotacion"),
                    rs.getInt("periodo_orbital"),
                    rs.getInt("diametro"),
                    rs.getString("clima"),
                    rs.getString("gravedad"),
                    rs.getString("terreno"),
                    rs.getString("agua_superficial"),
                    rs.getLong("poblacion"));

            listadoPlanetas.add(p);
        }

        return listadoPlanetas;
    }


}
