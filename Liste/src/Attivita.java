import java.io.Serializable;
import java.time.LocalDate;

public class Attivita implements Serializable {

    private String nota;
    private LocalDate start;
    private LocalDate stop;

    public Attivita(String nota) {
        this.nota = nota;
        start = LocalDate.now();
        stop = start;

    }

    @Override
    public String toString() {
        return nota + "\n- data inizio " + start + "\n- data fine " + stop;
    }
}
