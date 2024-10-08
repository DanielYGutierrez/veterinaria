package co.edu.uniquindio.poo;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro: \nNombre: " + nombre + "\n Raza: " + raza + "\n Edad: " + edad + "\n Peso: " + peso;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
