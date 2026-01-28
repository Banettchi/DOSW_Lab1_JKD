package reto5;

import java.util.*;
import java.util.stream.*;

public class Reto5 {

    public static Set<Integer> crearHashSet(Integer[] numeros) {
        return Arrays.stream(numeros)
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> crearTreeSet(Integer[] numeros) {
        return Arrays.stream(numeros)
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<Integer> unirConjuntos(Set<Integer> set1, Set<Integer> set2) {
        return Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        Integer[] nums1 = { 4, 9, 15, 7, 18, 21, 10, 5 };
        Integer[] nums2 = { 12, 3, 25, 10, 7, 30, 18, 4 };

        Set<Integer> hashSet = crearHashSet(nums1);
        Set<Integer> treeSet = crearTreeSet(nums2);
        Set<Integer> union = unirConjuntos(hashSet, treeSet);

        union.forEach(n -> System.out.println("Numero en arena: " + n));
    }
}
