package Ejercicio7;

import java.util.Scanner;

/**
 * • Ejercicio 7
 * Construir un programa que simule el funcionamiento de una calculadora que
 * puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto
 * y división) con valores numéricos enteros. El usuario debe especificar la
 * operación con el primer carácter del primer parámetro de la línea de comandos:
 * S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d
 * para la división. Los valores de los operandos se deben indicar en el segundo
 * y tercer parámetros.
 *
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elige operación aritmética. Sumar 's', restar 'r', multiplicar 'm', dividir 'd': ");
        String operacion = entrada.next();
        System.out.print("Introduce primer operando: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduce segundo operando: ");
        int num2 = entrada.nextInt();
        switch (operacion) {
            case "s" -> {
                int suma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + suma);
            }
            case "r" -> {
                int resta = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resta);
            }
            case "m" -> {
                int mult = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + mult);
            }
            case "d" -> {
                int div = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + div);
            }
            default -> System.out.println("Operación introducida de forma incorrecta");
        }
    }
}
