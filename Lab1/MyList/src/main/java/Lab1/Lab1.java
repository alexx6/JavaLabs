package Lab1;

public class Lab1 {
    public static MyList merge(MyList a, MyList b) {
        int ns = 0;
        ns += (a == null) ? 0 : a.size();
        ns += (b == null) ? 0 : b.size();
        if (ns == 0) throw new IllegalArgumentException("Both lists are empty");
        for (int i = 1; i < a.size(); i++) {
            if ((int)a.get(i-1) > (int)a.get(i)) throw new IllegalArgumentException("One or both lists are " +
                    "not sorted");
        }
        for (int i = 1; i < b.size(); i++) {
            if ((int)b.get(i-1) > (int)b.get(i)) throw new IllegalArgumentException("One or both lists are " +
                    "not sorted");
        }
        MyList m = new MyList();
        int i = 0;
        int j = 0;
        while (i != ((a == null) ? 0 : a.size()) || j != ((b == null) ? 0 : b.size())) {
            if (a.get(i) != null && b.get(i) != null) {
                if ((int) a.get(i) < (int) b.get(j)) {
                    m.add(a.get(i));
                    i++;
                } else {
                    m.add(b.get(j));
                    j++;
                }
            }
            else if (a.get(i) == null) {
                m.add(b.get(j));
                j++;
            }
            else {
                m.add(a.get(i));
                i++;
            }
        }
        return m;
    }

    public static void main(String[] args) {

        MyList test = new MyList();
        int[] a = {1, 2, 3};
        test.add(9876);
        test.add("string1");
        test.add(a);
        test.add("string2");
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(((int[])test.get(2))[0] + " " + ((int[])test.get(2))[1] + " " + ((int[])test.get(2))[2]);
        System.out.println(test.get(3));
        test.remove(2);
        System.out.println("Removed element with index 2");
        System.out.println("Current size: " + test.size());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        test.add("string3", 2);
        System.out.println("Added \"string3\" as element with index 2");
        System.out.println("Current size: " + test.size());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        test.set(7777,3);
        System.out.println("Changed element with index 3 to 7777");
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        System.out.println(test.contains("string3") ? "Contains вернул True для аргумента \"string3\"" :
                "\"Contains вернул False для аргумента \\\"string3\\\"");
        System.out.println(test.isEmpty() ? "isEmpty вернул True" : "isEmpty вернул False");
        System.out.println(test.indexOf("string3") + " - индекс элемента \"string3\"");
        MyList test1 = new MyList();
        MyList test2 = new MyList();
        test1.add(2);
        test1.add(5);
        test2.add(1);
        test2.add(3);
        test2.add(4);
        test2.add(6);
        MyList test12 = merge(test1, test2);
        System.out.println("Merged lists: ");
        System.out.println(test12.get(0));
        System.out.println(test12.get(1));
        System.out.println(test12.get(2));
        System.out.println(test12.get(3));
        System.out.println(test12.get(4));
        System.out.println(test12.get(5));
    }
}
