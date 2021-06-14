package BuclesEjerciciosDe8a14;

/**
 * • Ejercicio 9
 * Construir un programa que calcule el factorial de un valor numérico introducido
 * como parámetro o argumento en la línea de comandos.
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Ej9FactorialParam {

    /* En matemáticas, el factorial de un número se suele aplicar a los números enteros naturales.
    El factorial de un entero positivo n, es el factorial de n o n factorial y se define como
    el producto de todos los números enteros positivos desde 1 (es decir, los números naturales) hasta n.
    Los números naturales son aquellos que permiten contar los elementos de un conjunto.

    Debido a las propiedades de los factoriales, el programa puede fallar si se intenta calcular un factorial
    de un número muy alto, porque el resultado sería un entero demasiado grande. */

    public static void calcFactorial(int num) {
        int resultado = 1;
        if (num > -1) {
            for (int i = 0; i < num; i++) {
                resultado *= num - i;
            }
            System.out.println("El factorial de " + num + " es " + resultado);
        } else {
            System.out.println("No se permite calcular el factorial de " + num + " porque es un número entero negativo");
        }
    }

    public static void main(String[] args) {
        calcFactorial(5);
        calcFactorial(7);
        calcFactorial(0);
        calcFactorial(1);
        calcFactorial(-3);
    }
}
