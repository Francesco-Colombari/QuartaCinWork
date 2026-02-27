public class Nodo<T extends Comparable<T>>  {

    private T val;
    private Nodo<T> next, prev;

    public Nodo(T value) {
        this.val = value;
        next = prev = null;
    }

    @SuppressWarnings("unchecked")
    public void setNext(@SuppressWarnings("rawtypes") Nodo next) {
        this.next = next;
    }

    @SuppressWarnings("rawtypes")
    public Nodo getNext() {
        return next;
    }

    @SuppressWarnings("unchecked")
    public void setPrev(@SuppressWarnings("rawtypes") Nodo prev) {
        this.prev = prev;
    }

    @SuppressWarnings("rawtypes")
    public Nodo getPrev() {
        return prev;
    }

    public void setVal(T v) {
        val = v;
    }

    public T getVal() {
        return val;
    }

}

