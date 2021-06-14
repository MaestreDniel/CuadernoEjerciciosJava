package BuclesEjerciciosDe8a14;

/**
 * • Ejercicio 10
 * Construir un programa en el que, utilizando un bucle for, se escriba por pantalla
 * una tabla de conversión de grados Fahrenheit a Celsius, para los valores de 0
 * hasta 300 grados, en intervalos de 20. La regla de conversión es la siguiente:
 * ºC = (5/9)(ºF - 32)
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Ej10Conversion {

    public static void conversorFarhenCels() {
        for (int f = 0; f < 300; f += 20) {
            double celsius = (5.0 / 9.0) * (f - 32);
            System.out.println(f + " ºF = " + Math.round(celsius) + " ºC");
        }
    }

    public static void main(String[] args) {
        conversorFarhenCels();
    }
}
