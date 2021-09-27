public class Lab1HW {
    public static void main(String[] args) {
        MyMap test = new MyMap();
        test.put("key1", 1234);
        test.put("key1", 2345);
        test.put("key2", 3456);
        MyList k = test.getKeys();
        MyList v = test.getEntries();
        for (int i = 0; i < test.size(); i++) {
            System.out.println(k.get(i) + ": " + ((MyMap.pair)v.get(i)).Value());
        }
        System.out.println();
        test.put("key3", 4567);
        System.out.println("key2" + ": " + test.get("key2"));
        test.remove("key2");
        System.out.println();
        System.out.println("key2" + ": " + test.get("key2", "0"));
        System.out.println();
        k = test.getKeys();
        v = test.getValues();
        for (int i = 0; i < test.size(); i++) {
            System.out.println(k.get(i) + ": " + (int)v.get(i));
        }
    }
}