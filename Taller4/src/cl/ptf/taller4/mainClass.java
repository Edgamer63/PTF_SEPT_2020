package cl.ptf.taller4;

import java.util.ArrayList;
import java.util.List;

// En el mainClass, cree 10 instancias de la clase Email y hágalas pasar por el filtro del AntiSpam.
// Imprima por pantalla, los Email que fueron aceptados y aquellos que no fueron aceptados.

public class mainClass {
    public static void main(String[] args) {
        Email e1 = new Email("hola@miempresa.cl", "luis@smaria.cl", "saludos!", "Hola!");
        Email e2 = new Email("luis@forge.cl", "federico@smaria.cl", "saludos!", "Hola!");
        Email e3 = new Email("hola@uchile.cl", "federico@smaria.cl", "saludos!", "Hola!");
        Email e4 = new Email("hola@hbo.cl", "paco@forge.cl", "saludos!", "Hola!");
        Email e5 = new Email("hola@mundo.cl", "federico@lospollitosdicen.cl", "saludos!", "Hola!");
        Email e6 = new Email("tomas@miempresa.cl", "federico@miempresa.cl", "saludos!", "Hola!");
        Email e7 = new Email("tomas@mundo.cl", "tomas@cafe.cl", "saludos!", "Hola!");
        Email e8 = new Email("hola@netflix.cl", "federico@miempresa.cl", "saludos!", "Hola!");
        Email e9 = new Email("hugo@prime.cl", "hugo@smaria.cl", "saludos!", "Hola!");
        Email e10 = new Email("hugo@miempresa.cl", "federico@miempresa.cl", "saludos!", "Hola!");

        List<Email> correos = new ArrayList<Email>();
        correos.add(e1);
        correos.add(e2);
        correos.add(e3);
        correos.add(e4);
        correos.add(e5);
        correos.add(e6);
        correos.add(e7);
        correos.add(e8);
        correos.add(e9);
        correos.add(e10);

        AntiSpam spamAssasin = new AntiSpam();
        spamAssasin.filtro(correos);

        System.out.println("Email aceptados:");
        for (Email e : spamAssasin.getEmailAceptados() ) {
            System.out.println(e.toString());
        }

        System.out.println("Email no aceptados:");
        for (Email e : spamAssasin.getEmailNoAceptados() ) {
            System.out.println(e.toString());
        }

        //for (Email e : correos) {
        //    System.out.println(e.toString());
        //}

        //System.out.println("************");
        //List<Email> correosFiltrados = filtro( correos );
        //for (Email mail : correosFiltrados) {
        //    System.out.println(mail.toString());
        //}
    }

    // Implemente un filtro (en una función) de correos electrónicos, con las siguientes características:
    // solo debe permitir el paso de Email cuyo mensaje no esté en blanco.
    // solo debe permitir el paso de Email cuyo origen (from) sean direcciones corporativas (@miempresa.cl)
    public static List<Email> filtro(List<Email> correos) {
        List<Email> aceptados = new ArrayList<Email>();

        for (Email e : correos) {
            if (!e.getMessage().isEmpty() && e.getFrom().contains("@miempresa.cl")) {
                aceptados.add(e);
            }
        }

        return aceptados;
    }
}
