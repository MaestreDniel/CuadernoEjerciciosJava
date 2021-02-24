package Ejercicio1;

/**
 * • Ejercicio 1
 * Crear dos variables de cualquiera de los tipos básicos, dar un valor a la primera
 * y a continuación asigne la segunda a la primera. Imprimir por pantalla las dos
 * variables. Cambiar el valor de la segunda variable y volver a imprimir las variables
 * por pantalla. ¿Qué es lo que ocurre?
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Coche {
    // Atributos como variables de instancia
    private String brand;
    private String brandTwo;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandTwo() {
        return brandTwo;
    }

    public void setBrandTwo(String brandTwo) {
        this.brandTwo = brandTwo;
    }
}
