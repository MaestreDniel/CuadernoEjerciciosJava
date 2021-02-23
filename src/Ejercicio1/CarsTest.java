package Ejercicio1;

public class CarsTest {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setBrand("Audi");
        coche1.setBrandTwo("Audi");
        System.out.println("Variable 1 = " + coche1.getBrand() + " Variable 2 = " + coche1.getBrandTwo()); // Antes de cambiar
        coche1.setBrandTwo("Renault");
        System.out.println("Variable 1 = " + coche1.getBrand() + " Variable 2 = " + coche1.getBrandTwo()); // Después de cambiar
    }
}
