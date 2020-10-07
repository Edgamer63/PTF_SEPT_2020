package cl.ptf.taller6;

import cl.ptf.taller6.dao.PlanetaDAO;
import cl.ptf.taller6.dto.Planeta;

import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            PlanetaDAO daoPlaneta = new PlanetaDAO();

            // todos los planetas
            System.out.println("Todos los planetas:");
            List<Planeta> listadoPlanetas = daoPlaneta.obtenerTodos();
            for (Planeta p : listadoPlanetas) {
                System.out.println(p.toString());
            }

            // planetas con too en su nombre
            System.out.println("Planetas con 'too' en su nombre");
            listadoPlanetas = daoPlaneta.obtenerPorNombre("too");
            for (Planeta p : listadoPlanetas) {
                System.out.println(p.toString());
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
