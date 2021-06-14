package Clase2503;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = entrada.nextDouble();
        double pi = Math.PI;
        double area = Math.pow(radio,2)*pi;
        System.out.println("El área del circulo es " + area);
    }
}
