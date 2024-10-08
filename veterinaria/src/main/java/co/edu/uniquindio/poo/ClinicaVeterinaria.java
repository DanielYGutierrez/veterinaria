package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class ClinicaVeterinaria {
    private String nombre;
    private String direccion;
    private LinkedList<Animal> animales;
    
    public ClinicaVeterinaria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.animales = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clinica Veterinaria: " + nombre + ", Direccion: " + direccion + "\n Animales: " + animales;
    }

    public LinkedList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(LinkedList<Animal> animales) {
        this.animales = animales;
    }
    
    public void agregarAnimalAVeterinaria(Animal animal){
        animales.add(animal);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}