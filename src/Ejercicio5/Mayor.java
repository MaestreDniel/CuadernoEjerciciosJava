package Ejercicio5;

import java.util.Scanner;

/**
 * • Ejercicio 5
 * Definir dos variables num1 y num2 e implementar un programa que asigne un
 * valor a cada una, y obtenga el mayor de los dos, mostrando el resultado por
 * pantalla.
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un primer número entero: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduce un segundo número entero: ");
        int num2 = entrada.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es el " + num1);
        } else if (num1 == num2) {
            System.out.println(num1 + " y " + num2 + " son iguales.");
        } else {
            System.out.println("El número mayor es el " + num2);
        }
    }
}
