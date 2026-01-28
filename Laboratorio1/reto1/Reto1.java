package reto1;

import java.util.*;
import java.util.stream.*;

class Estudiante {
    String nombre;
    int edad;
    String correo;
    int semestre;

    Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }
}

public class Reto1 {
    public static void main(String[] args) {
        List<Estudiante> equipo = Arrays.asList(
                new Estudiante("Juliana", 20, "maria.rcaicedo@mail.escuelaing.edu.co", 7),
                new Estudiante("Kevyn", 21, "kevyn.forero-g@mail.escuelaing.edu.co", 7),
                new Estudiante("Diego", 20, "diego.montes-b@mail.escuelaing.edu.co", 7));

        String mensaje = equipo.stream().map(e -> e.nombre + " de " + e.semestre + " semestre de " + e.edad + " anos")
                .collect(Collectors.joining(" y "));

        String correos = equipo.stream().map(e -> e.correo).collect(Collectors.joining(" y "));

        System.out.println("Somos el equipo conformado por " + mensaje);
        System.out.println("Nuestros correos son " + correos);
    }
}
