package Ejercicio4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una altura en metros con el formato 'x,xx': ");
        double num1 = entrada.nextDouble();
        System.out.print("Introduce un peso en kg con el formato 'x,xx': ");
        double num2 = entrada.nextDouble();
        IMC persona1 = new IMC();
        DecimalFormat dec = new DecimalFormat("###.##"); // DecimalFormat permite redondear a x decimales
        persona1.setAltura(num1);
        persona1.setMasa(num2);
        double indice = persona1.getMasa()/Math.pow(persona1.getAltura(), 2);
        System.out.println("El IMC de esta persona es " + dec.format(indice));
    }
}
