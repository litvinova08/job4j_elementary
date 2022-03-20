package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (in, s) -> map.put(in, s);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        BiPredicate<Integer, String> biPred = ((i, s) -> i % 2 == 0 || map.get(i).length() == 4);
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
            Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
            Consumer<String> con = (s) -> System.out.println(s);
            Function<String, String> func = (st) -> st.toUpperCase();
            List<String> list = sup.get();
            for (String s : list) {
                func.apply(s);
                con.accept(s);
            }

        }
    }
}