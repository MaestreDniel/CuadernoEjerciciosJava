package Ejercicio2;

public class Aritmetica {
    public static void main(String[] args) {
        Numeros mates = new Numeros();
        mates.setNum1(12);
        mates.setNum2(4);
        int suma = mates.getNum1() + mates.getNum2();
        int resta = mates.getNum1() - mates.getNum2();
        int multiplicacion = mates.getNum1() * mates.getNum2();
        int division = mates.getNum1() / mates.getNum2();
        System.out.println("La suma de " + mates.getNum1() + " y " + mates.getNum2() + " es = " + suma);
        System.out.println("La resta de " + mates.getNum1() + " y " + mates.getNum2() + " es = " + resta);
        System.out.println("La multiplicación de " + mates.getNum1() + " y " + mates.getNum2() + " es = " + multiplicacion);
        System.out.println("La division de " + mates.getNum1() + " y " + mates.getNum2() + " es = " + division);
    }
}
