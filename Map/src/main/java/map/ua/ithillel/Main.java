package map.ua.ithillel;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("vasia", 2);
        myMap.put("petia", 5);
        myMap.put("oleh", 3);
        myMap.put("petia", 1);

        for (Pair<String, Integer> i : myMap) {
            System.out.println(i);
        }
    }


}
