package reto2;

import java.util.*;
import java.util.function.*;

class Resultados {
    int maximo;
    int minimo;
    int cantidad;

    public String toString() {
        return "Maximo: " + maximo + ", Minimo: " + minimo + ", Cantidad: " + cantidad;
    }
}

public class Reto2 {

    static Function<List<Integer>, Integer> calcularMaximo = lista -> lista.stream().max(Integer::compareTo).orElse(0);

    static Function<List<Integer>, Integer> calcularMinimo = lista -> lista.stream().min(Integer::compareTo).orElse(0);

    static Function<List<Integer>, Integer> contarElementos = lista -> (int) lista.stream().count();

    public static Resultados analizarLista(List<Integer> lista) {
        Resultados r = new Resultados();
        r.maximo = calcularMaximo.apply(lista);
        r.minimo = calcularMinimo.apply(lista);
        r.cantidad = contarElementos.apply(lista);
        return r;
    }

    public static void main(String[] args) {
        List<Integer> numeros1 = Arrays.asList(5, 12, 3, 8, 15, 7);
        List<Integer> numeros2 = Arrays.asList(4, 9, 2, 16, 11);

        System.out.println("Lista 1: " + analizarLista(numeros1));
        System.out.println("Lista 2: " + analizarLista(numeros2));
    }
}
