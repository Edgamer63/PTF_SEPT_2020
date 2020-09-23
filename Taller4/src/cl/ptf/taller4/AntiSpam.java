// Implemente la clase AntiSpam. Incorpore y modifique el filtro creado
// anteriormente en el método filtrar.
// La clase AntiSpam debe almacenar todos los emailAceptados y los emailNoAceptados
// sin un orden en particular.

package cl.ptf.taller4;

import java.util.ArrayList;
import java.util.List;

public class AntiSpam {
    List<Email> emailAceptados;
    List<Email> emailNoAceptados;

    public AntiSpam() {
        emailAceptados = new ArrayList<Email>();
        emailNoAceptados = new ArrayList<Email>();
    }

    public void filtro(List<Email> correos) {
        for (Email e : correos) {
            if( !e.getMessage().isEmpty() && e.getFrom().contains("@miempresa.cl") ) {
                emailAceptados.add(e);
            } else {
                emailNoAceptados.add(e);
            }
        }
    }

    public List<Email> getEmailAceptados() {
        return emailAceptados;
    }

    public List<Email> getEmailNoAceptados() {
        return emailNoAceptados;
    }
}
