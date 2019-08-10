package Demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Demot {
    public static void main(String[] args) {

        String str = "sdajdhakdha";

        String s = getStringCount(str);

        System.out.println(s);
    }

    private static String getStringCount(String str) {

        char[] cha = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
//        Iterator<Character> it = map.keySet().iterator();
        for (int i = 0; i < cha.length; i++) {
            Integer value = map.get(cha[i]);
            int count = 1;
            if (value != null) {
                count = value + 1;
            }
            map.put(cha[i], count);
        }
//        return mapToString(map);
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            Character key =it.next();
            Integer value=map.get(key);

            sb.append(key+"("+value+")");
        }
        return sb.toString();
    }

//    public static String mapToString(Map<Character, Integer> map) {
//        StringBuilder sb = new StringBuilder();
//        Iterator<Character> it = map.keySet().iterator();
//        while (it.hasNext()) {
//            Character key =it.next();
//            Integer value=map.get(key);
//
//            sb.append(key+"("+value+")");
//        }
//        return sb.toString();
//    }
}
