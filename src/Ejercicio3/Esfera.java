package Ejercicio3;

/**
 * • Ejercicio 3
 * Construir un programa que, dado el radio de una esfera, calcule y devuelva por
 * pantalla el valor de la superficie y el volumen de la esfera correspondiente. Para
 * obtener el valor de PI, utilizar la variable estática Math.PI.
 * Volumen esfera = (4/3)*PI*R3
 * Superficie esfera = 4*PI*R2
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class Esfera {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
