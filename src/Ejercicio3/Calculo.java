package Ejercicio3;

public class Calculo {
    public static void main(String[] args) {
        Esfera ejemplo = new Esfera();
        ejemplo.setRadio(3.5);
        double area = 4*Math.PI*Math.pow(ejemplo.getRadio(),2);
        double volumen = (4.0/3.0)*Math.PI*Math.pow(ejemplo.getRadio(),3);
        System.out.println("El área de la esfera de radio " + ejemplo.getRadio() + " cm es " + Math.round(area) + " cm2");
        System.out.println("El volumen de la esfera de radio " + ejemplo.getRadio() + " cm es " + Math.round(volumen) + " cm2");
    }
}
