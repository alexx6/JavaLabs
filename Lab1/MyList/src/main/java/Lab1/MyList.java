package Lab1;

public class MyList {
    private Object[] l;
    private int size;

    public MyList() {
        l = new Object[0];
        size = 0;
    }

    public void add(Object v) {
        size += 1;
        Object[] l1 = new Object[size];
        for (int k = 0; k < size-1; k++) {
            l1[k] = l[k];
        }
        l1[size-1] = v;
        l = l1;
    }

    public Object get(int i) {
        if (i < size && i >= 0) {
            return l[i];
        } else {
            return null;
        }
    }

    public int size() {
        return size;
    }

    public void add(Object v, int i ) {
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

    public int indexOf(Object v) {
        for (int k = 0; k < size; k++) {
            if (l[k].equals(v)) return k;
        }
        return -1;
    }

    public boolean contains (Object v) {
        if (indexOf(v) >= 0) return true;
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public Object remove (int i) {
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


    public void set(Object v, int i) {
        if (i >= 0 && i < size) l[i] = v;
    }
}
