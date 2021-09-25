public class Lab1 {
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
    }
}
