package Lab1HW;

import Lab1.MyList;

public class MyMap {

    public class pair {
        private final Object k;
        private final Object v;

        public pair(Object key, Object value) {
             k = key;
             v = value;
        }

        public Object Key () {
            return k;
        }

        public Object Value () {
            return v;
        }

    }

    private final MyList pairs;
    private  int size;

    public MyMap() {
        pairs = new MyList();
        size = 0;
    }

    public void put(Object key, Object value) {
        if (!keyContains(key)) {
            pairs.add(new pair(key, value));
            size++;
        }
    }

    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if (((pair)pairs.get(i)).k.equals(key)) return ((pair)pairs.get(i)).v;
        }
        return null;
    }

    public Object get(Object key, Object bydefault) {
        for (int i = 0; i < size; i++) {
            if (((pair)pairs.get(i)).k.equals(key)) {
                return ((pair) pairs.get(i)).v;
            }
        }
        return bydefault;
    }

    public Object remove(Object key) {
        Object rv;
        for (int i = 0; i < size; i++) {
            if (((pair)pairs.get(i)).k.equals(key)) {
                rv = ((pair) pairs.get(i)).v;
                pairs.remove(i);
                size--;
                return rv;
            }
        }
        return null;
    }

    public boolean keyContains(Object key) {
        for (int i = 0; i < size; i++) {
            if (((pair)pairs.get(i)).k.equals(key)) return true;
        }
        return false;
    }

    public MyList getKeys() {
        if (size == 0) return null;
        MyList rk = new MyList();
        for(int i = 0; i < size; i++) {
            rk.add(((pair)pairs.get(i)).k);
        }
        return rk;
    }

    public MyList getValues() {
        if (size == 0) return null;
        MyList rv = new MyList();
        for(int i = 0; i < size; i++) {
            rv.add(((pair)pairs.get(i)).v);
        }
        return rv;
    }

    public MyList getEntries() {
        if (size == 0) return null;
        MyList re = new MyList();
        for(int i = 0; i < size; i++) {
            re.add(pairs.get(i));
        }
        return re;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



}
