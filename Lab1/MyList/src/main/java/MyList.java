public class MyList {
    private Object[] l;
    private int size;

    MyList() {
        l = new Object[0];
        size = 0;
    }

    void add(Object v) {
        size += 1;
        Object[] l1 = new Object[size];
        for (int k = 0; k < size-1; k++) {
            l1[k] = l[k];
        }
        l1[size-1] = v;
        l = l1;
    }

    Object get(int i) {
        if (i < size && i >= 0) {
            return l[i];
        } else {
            return null;
        }
    }

    int size() {
        return size;
    }

    void add(Object v, int i ) {
        if (i == size) {
            add(v);
            return;
        }
        size += 1;
        Object[] l2 = new Object[size];
        for (int k = 0; k < i; k++) {
            l2[k] = l[k];
        }
        for (int k = i+1; k < size; k++) {
            l2[k] = l[k-1];
        }
        l2[i] = v;
        l = l2;
    }

    int indexOf(Object v) {
        for (int k = 0; k < size; k++) {
            if (l[k] == v) return k;
        }
        return -1;
    }

    boolean contains (Object v) {
        if (indexOf(v) >= 0) return true;
        return false;
    }

    boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    Object remove (int i) {
        if (i >= size || i < 0) return null;
        size--;
        Object v1 = l[i];
        if (size == 0) {
            l = new Object[0];
            return v1;
        }
        Object[] l3 = new Object[size];
        for (int k = 0; k < i; k++) {
            l3[k] = l[k];
        }
        for (int k = i+1; k < size+1; k++) {
            l3[k-1] = l[k];
        }
        l = l3;
        return v1;
    }

    void set(Object v, int i) {
        if (i >= 0 && i < size) l[i] = v;
    }
}
