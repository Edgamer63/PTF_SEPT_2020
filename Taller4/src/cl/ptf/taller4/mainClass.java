package cl.ptf.taller4;

import java.util.ArrayList;
import java.util.List;

public class mainClass {
    public static void main(String[] args) {
        Email e1 = new Email("juan@miempresa.cl", "pepito@gmail.com", "hola!", "cómo estás?... atte., yo");
        Email e2 = new Email("frank@miempresa.cl", "clara@gmail.com", "hola!", "");
        Email e3 = new Email("jnatera@gmail.com", "mibanez@gmail.com", "hola!", "cómo estás?... atte., yo");
        Email e4 = new Email("ajimenez@gmail.com", "raraya@gmail.com", "hola!", "cómo estás?... atte., yo");
        Email e5 = new Email("kcampos@miempresa.com", "nmuller@gmail.com", "hola!", "cómo estás?... atte., yo");

        List<Email> correos = new ArrayList<Email>();
        correos.add(e1);
        correos.add(e2);
        correos.add(e3);
        correos.add(e4);
        correos.add(e5);

        for (Email e : correos) {
            System.out.println(e.toString());
        }


        System.out.println("************");
        List<Email> correosFiltrados = filtro( correos );
        for (Email mail : correosFiltrados) {
            System.out.println(mail.toString());
        }
    }

    // Implemente un filtro (en una función) de correos electrónicos, con las siguientes características:
    // solo debe permitir el paso de Email cuyo mensaje no esté en blanco.
    // solo debe permitir el paso de Email cuyo origen (from) sean direcciones corporativas (@miempresa.cl)
    public static List<Email> filtro(List<Email> correos) {
        List<Email> aceptados = new ArrayList<Email>();

        for (Email e : correos) {
            if( !e.getMessage().isEmpty() && e.getFrom().contains("@miempresa.cl") ) {
                aceptados.add(e);
            }
        }

        return aceptados;
    }
}
