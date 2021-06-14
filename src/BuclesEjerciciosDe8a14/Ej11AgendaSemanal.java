package BuclesEjerciciosDe8a14;

import java.util.Arrays;

/**
 * • Ejercicio 11
 * Definir un array bidimensional para representar una agenda semanal, donde se
 * contemplen los 7 días de la semana y las 24 horas de cada día. Utilizar bucles
 * for anidados para inicializar la agenda a: "No tengo planes.". Añadir "planes" a la
 * agenda y mostrar el resultado por pantalla.
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Ej11AgendaSemanal {

    public static void planificacion() {
        String[][] agenda = new String[7][24];
        for (int i = 0; i < agenda.length; i++) {
            Arrays.fill(agenda[i], "No tengo planes.");
        }
        agenda[1][10] = "Programar en Java";
        agenda[1][18] = "Entrenamiento de fuerza";
        agenda[2][9] = "Desarrollo de Aplicaciones Web";
        for (int i = 1; i < agenda.length; i++) {
            for (int j = 1; j < agenda[i].length; j++) {
                System.out.println("Día " + i + " Hora " + j + " - " + agenda[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        planificacion();
    }
}
