/**
 * Implemente una clase que represente la información en un Email
 * (from, to, subject, message).
 * Todos los atributos del Email son visibles desde el exterior de
 * la clase pero una vez creados no pueden ser modificados nunca.
**/

package cl.ptf.taller4;

public class Email {
    private String from;
    private String to;
    private String subject;
    private String message;

    public Email(String from, String to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
