package reto4;

import java.util.*;
import java.util.stream.*;

public class Reto4 {

    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();
        pares.forEach(par -> mapa.putIfAbsent(par.getKey(), par.getValue()));
        return mapa;
    }

    public static Map<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new Hashtable<>();
        pares.forEach(par -> mapa.putIfAbsent(par.getKey(), par.getValue()));
        return mapa;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap, Map<String, Integer> hashtable) {
        return Stream.concat(hashMap.entrySet().stream(), hashtable.entrySet().stream())
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        TreeMap::new));
    }

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> paresHashMap = Arrays.asList(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10));

        List<Map.Entry<String, Integer>> paresHashtable = Arrays.asList(
                Map.entry("plata", 8),
                Map.entry("rubi", 4),
                Map.entry("oro", 12),
                Map.entry("esmeralda", 6));

        Map<String, Integer> hm = crearHashMap(paresHashMap);
        Map<String, Integer> ht = crearHashtable(paresHashtable);
        Map<String, Integer> resultado = combinarMapas(hm, ht);

        resultado.forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
    }
}
