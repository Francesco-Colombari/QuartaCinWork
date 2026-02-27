import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        ListaOrdinata<String> l = new ListaOrdinata<>();
        l.add("Alice");
        l.add("Mattia");
        l.add("Andrea");
        l.add("SimonePavan");
        System.out.println(l);

        ListaOrdinata<Bici> lb= new ListaOrdinata<>();
        lb.add(new Bici(16, Colori.BIANCO));
        lb.add(new Bici(20, Colori.ROSA));
        lb.add(new Bici(25, Colori.AZZURRO));
        System.out.println(lb);

        ArrayList<Bici> alb = new ArrayList<>();
        alb.add(new Bici(32, Colori.ROSA));
        alb.add(new Bici(42, Colori.AZZURRO));
        alb.add(new Bici(47, Colori.BIANCO));
        System.out.println(alb);
        Collections.sort(alb);

    }

}
