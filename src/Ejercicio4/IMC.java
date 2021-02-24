package Ejercicio4;

/**
 * • Ejercicio 4
 * Construir un programa que dado el peso (en kilogramos) y la altura de una
 * persona (en metros) calcule y muestre por pantalla su Indice de Masa Corporal
 * (IMC) o índice de Quetelet. Este índice pretende determinar el intervalo de peso
 * más saludable que puede tener una persona. El valor de este índice se calcula
 * mediante la siguiente expresión:
 *
 * IMC = peso/altura2
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class IMC {
    private double masa;
    private double altura;

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
