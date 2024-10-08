package co.edu.uniquindio.poo;

public class Gato extends Animal {
    
    private String color;

    public Gato(String nombre, int edad, double peso, String color) {
        super(nombre, edad, peso);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato: \nNombre: " + nombre + "\n Color: " + color + "\n Edad: " + edad + "\n Peso:" + peso;
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
