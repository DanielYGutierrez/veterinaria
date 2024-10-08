package co.edu.uniquindio.poo;

public class AveSalvaje extends Animal{
    private double distanciaVuelo;
    private double tamañoAlas;
    
    public AveSalvaje(String nombre, int edad, double peso, double distanciaVuelo, double tamañoAlas) {
        super(nombre, edad, peso);
        this.distanciaVuelo = distanciaVuelo;
        this.tamañoAlas = tamañoAlas;
    }

    public double getDistanciaVuelo() {
        return distanciaVuelo;
    }

    public void setDistanciaVuelo(double distanciaVuelo) {
        this.distanciaVuelo = distanciaVuelo;
    }

    public double getTamañoAlas() {
        return tamañoAlas;
    }

    public void setTamañoAlas(double tamañoAlas) {
        this.tamañoAlas = tamañoAlas;
    }

    @Override
    public String toString() {
        return "Ave Salvaje: \nNombre: " + nombre + "\n Distancia Vuelo: " + distanciaVuelo + "\n Edad: " + edad + "\n Peso:"
                + peso + "\n Tamaño Alas: " + tamañoAlas;
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
