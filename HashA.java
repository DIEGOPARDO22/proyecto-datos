import ItemNotFound;
import ListLinkend;

public class HashA<t> {

    protected class element<t> {

        protected int mark;
        protected t reg;

        public element(int mark, t reg) {
            this.mark = mark;
            this.reg = reg;
        }

    }
    int size;
    ListLinkend[] table;
    public HashA(int size) {
        this.size = size;
        table = new ListLinkend[size];

        for (int i = 0; i < size; i++) {
            table[i] = null;
        }

    }
    public t search(int key) throws ItemNotFound {

        int dressHash = (key % size);

        if (table[dressHash] == null) {
            System.out.println("No existe");
            return null;
        } else {

            ListLinkend actual = table[dressHash];

            while (actual != null && actual.getKey() != key) {
                actual = actual.getNext();
            }

            if (actual == null) {
                System.out.println();

            } else {

                return (t) actual.getValue();

            }
        }
        return null;
    }
    public void mostrar() {

        ListLinkend actual = table[0];

        while (actual != null) {
            actual = actual.getNext();
        }

        if (actual == null) {
            System.out.println();

        } else {
            System.out.println(actual.getValue().toString());
            System.out.println(actual.getKey());
        }

    }
    public void insert(int key, t value) {

        int dressHash = (key % size);

        if (table[dressHash] == null) {
            table[dressHash] = new ListLinkend(key, value);
        } else {

            ListLinkend actual = table[dressHash];

            while (actual.getNext() != null && actual.getKey() != key) {
                actual = actual.getNext();
            }

            if (actual.getKey() == key) {
                actual.setValue(value);
            } else {
                actual.setNext(new ListLinkend(key, value));
            }

        }

    }

    public void delete(int key) {

        int dressHash = (key % size);

        if (table[dressHash] != null) {

            ListLinkend anterior = null;

            ListLinkend actual = table[dressHash];

            while (actual.getNext() != null && actual.getKey() != key) {

                anterior = actual;

                actual = actual.getNext();

            }

            if (actual.getKey() == key) {

                if (anterior == null) {
                    table[dressHash] = actual.getNext();
                } else {
                    anterior.setNext(actual.getNext());
                }

            }

        }

    }
}
