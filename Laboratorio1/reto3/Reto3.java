package reto3;

import java.util.function.*;

public class Reto3 {

    static Function<String, String> repetirConBuilder = mensaje -> {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje).append(" ");
        }
        return sb.toString().trim();
    };

    static Function<String, String> invertirConBuffer = mensaje -> {
        StringBuffer buffer = new StringBuffer(mensaje);
        return buffer.reverse().toString();
    };

    static Function<String, String> ecoMisterioso = mensaje -> {
        String repetido = repetirConBuilder.apply(mensaje);
        return invertirConBuffer.apply(repetido);
    };

    public static void main(String[] args) {
        String mensaje = "Hola";
        String resultado = ecoMisterioso.apply(mensaje);
        System.out.println("Original: " + mensaje);
        System.out.println("Eco misterioso: " + resultado);
    }
}
