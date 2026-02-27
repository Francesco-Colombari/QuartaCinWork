public class ListaOrdinata<T extends Comparable<T>> {

    Nodo<T> head;

    public ListaOrdinata() {
        head = null;
    }

    @SuppressWarnings("unchecked")
    public void add(T v) {
        Nodo<T> n = new Nodo<>(v);
        if (head == null) {
            head = n;
            return;
        }
        if (head.getVal().compareTo(v) > 0) {
            // Lo inserisco in testa
            n.setNext(head);
            head = n;
            return;
        }
        Nodo<T> temp = head;
        while (true) {
            if (temp.getNext() == null) {
                // Lo inserisco in coda
                temp.setNext(n);
                return;
            }
            if (temp.getNext().getVal().compareTo(v) > 0) {
                // Lo inserisco fra Temp ed il successivo
                n.setNext(temp.getNext());
                temp.setNext(n);
                break;
            }
            temp = temp.getNext();
        }
    }

    @SuppressWarnings("unchecked")
    public String toString() {
        String s = "La lista contiene:\n";
        Nodo<T> tmp = head;
        while (tmp != null) {
            s += tmp.getVal() + "\n";
            tmp = tmp.getNext();
        }
        return s;
    }
}
