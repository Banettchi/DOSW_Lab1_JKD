package reto6;

import java.util.*;

public class Reto6 {
    private static Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () -> System.out.println("La maquina dice: Saludos viajero del tiempo y del codigo"));
        comandos.put("DESPEDIR",
                () -> System.out.println("La maquina dice: Que los bits te acompanen hasta la proxima mision"));
        comandos.put("CANTAR", () -> System.out.println("La maquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La maquina gira y emite chispas: Girando en modo fiesta"));
        comandos.put("BROMEAR", () -> System.out
                .println("La maquina rie: Por que la RAM rompio con la CPU? Porque necesitaba espacio"));
        comandos.put("GRITAR", () -> System.out.println("La maquina grita: ALERTA DE STACK OVERFLOW"));
        comandos.put("SUSURRAR", () -> System.out.println("La maquina susurra: Shhh los bugsestan dormidos"));
        comandos.put("ANALIZAR",
                () -> System.out.println("La maquina procesa: Analizando datos resultado eres increible programando"));
    }

    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando desconocido: " + comando);
        }
    }

    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
    }
}
