
public class Lista<T extends Comparable<T>> {

    private Nodo<T> root;

    public Lista() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    @SuppressWarnings("rawtypes")
    public int getLength() {
        Nodo tmp = root;
        int l = 0;
        while (tmp != null) {
            l++;
            tmp = tmp.getNext();
        }
        return l;
    }

    public void add(T val) {
        Nodo<T> n = new Nodo<>(val);
        addTail(n);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addHead(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            n.setNext(root);
            root.setPrev(n);
            root = n;
        }

    }

    @SuppressWarnings("unchecked")
    public void addTail(Nodo<T> n) {
        if (root == null) {
            root = n;
        } else {
            Nodo<T> tmp = root;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
            n.setPrev(tmp);
        }
    }

    @SuppressWarnings("unchecked")
    public boolean remove(T val) {
        if (root == null) {
            return false;
        }

        if (root.getVal().compareTo(val) == 0) {
            root = root.getNext();
            if (root != null) {
                root.setPrev(null);
            }
            return true;
        }

        Nodo<T> tmp = root.getNext();

        while (tmp != null) {
            if (tmp.getVal().compareTo(val) == 0) {

                if (tmp.getPrev() != null) {
                    tmp.getPrev().setNext(tmp.getNext());
                }

                if (tmp.getNext() != null) {
                    tmp.getNext().setPrev(tmp.getPrev());
                }

                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public boolean removeHead() {
        if (root == null) {
            return false;
        }

        root = root.getNext();
        if (root != null) {
            root.setPrev(null);
        }
        return true;
    }

    public boolean removeTail() {
        if (root == null) {
            return false;
        }

        if (root.getNext() == null) {
            root = null;
            return true;
        }

        Nodo<T> tail = getTail();
        tail.getPrev().setNext(null);
        return true;
    }

    @SuppressWarnings("unchecked")
    public boolean exists(T val) {
        Nodo<T> tmp = root;
        while (tmp != null) {
            if (tmp.getVal().compareTo(val) == 0) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Nodo find(T val) {
        Nodo<T> tmp = root;
        while (tmp != null) {
            if (tmp.getVal().compareTo(val) == 0) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public Nodo<T> getTail() {
        Nodo<T> tmp = root;
        if (tmp == null) {
            return null;
        }

        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    @SuppressWarnings("unchecked")
    public boolean clear() {
        Nodo<T> tmp = root;
        while (tmp != null) {
            Nodo<T> next = tmp.getNext();
            tmp.setNext(null);
            tmp.setPrev(null);
            tmp = next;
        }
        root = null;
        return true;
    }

    @SuppressWarnings("unchecked")
    public String toReverseString() {
        String s = "Lista al contrario:\n";
        Nodo<T> tmp = getTail();

        while (tmp != null) {
            s += tmp.getVal() + "\n";
            tmp = tmp.getPrev();
        }
        return s;
    }

    @SuppressWarnings("unchecked")
    @Override
    public String toString() {
        String s = "La lista contiene:\n";
        Nodo<T> tmp = root;
        while (tmp != null) {
            s += tmp.getVal() + "\n";
            tmp = tmp.getNext();
        }
        return s;
    }

}
