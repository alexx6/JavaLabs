import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for(String w : s) {
            Object k = m.get(w);
            m.put(w, (k == null) ? 1 : ((int)k + 1));
        }
        for(Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
