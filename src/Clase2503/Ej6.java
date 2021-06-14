package Clase2503;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = entrada.nextInt();
        if (num % 2 == 0){
            System.out.println("El número " + num + " es divisible entre 2.");
        } else {
            System.out.println("El número " + num + " no es divisible entre 2.");
        }
    }
}
