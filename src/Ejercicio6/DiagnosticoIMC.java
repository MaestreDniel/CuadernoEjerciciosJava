package Ejercicio6;

import static Ejercicio4.CalculoIMC.CalcularIMC;

/**
 * • Ejercicio 6
 * Construir un programa que calcule el índice de masa corporal de una persona
 * (IMC = peso [kg] / altura2[m]) e indique el estado en el que se encuentra esa
 * persona en función del valor de IMC:
 * | Valor de IMC | Diagnóstico | | --------------------: | :------------- | | < 16 | Criterio de
 * ingreso en hospital | | de 16 a 17 | Infrapeso | | de 17 a 18 | Bajo peso | de 18 a
 * 25 | Peso normal (saludable) | de 25 a 30 | Sobrepeso | de 30 a 35 | Sobrepeso
 * crónico | de 35 a 40 | Obesidad premórbida | > 40 | Obesidad mórbida
 *
 * @author Daniel Maestre
 * @version 1.0
 * Módulo programación 1º de DAW
 */

public class DiagnosticoIMC {
    public static void main(String[] args) {
        double imc = CalcularIMC(); // Aquí se reutiliza el método que hice en el ejercicio 4
        if (imc < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc < 18) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Sobrepeso crónico");
        } else if (imc < 40) {
            System.out.println("Obesidad premórbida");
        } else {
            System.out.println("Obesidad mórbida");
        }
    }
}
