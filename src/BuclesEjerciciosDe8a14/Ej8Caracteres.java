package BuclesEjerciciosDe8a14;

import java.lang.*;

/**
 * • Ejercicio 8
 * Construir un programa que visualice por pantalla todos los caracteres
 * correspondientes a letras minúsculas.
 *
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Ej8Caracteres {

    /* En este método se filtran cada uno de los caracteres pasados como parámetro.
    El filtro se pasa si el caracter en cuestión es una letra minúscula */
    public static void mostrarMinusculas(char[] palabra) {
        StringBuilder letras = new StringBuilder();
        for (char c : palabra) {
            if (c == Character.toLowerCase(c)) {
                letras.append(c);
            }
        }
        System.out.println(letras);
    }

    public static void main(String[] args) {
        mostrarMinusculas(new char[]{'a', 'B', 'c', 'D', 'e'});
        mostrarMinusculas(new char[]{'A', 'B', 'c', 'd', 'E'});
        mostrarMinusculas(new char[]{'q', 'w', 'e', 'R', 'T', 'y'});
    }
}
