package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Dueño {
    private String nombre;
    private String telefono;
    private LinkedList<Gato> gatos;
    private LinkedList<Perro> perros;
    
    public Dueño(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.gatos = new LinkedList<>();
        this.perros = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public LinkedList<Gato> getGatos() {
        return gatos;
    }

    public LinkedList<Perro> getPerros() {
        return perros;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Dueño: \nNombre: " + nombre + "\n Telefono: " + telefono + "\n Gatos: " + gatos + "\n Perros: " + perros;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void agregarPerroADueño(Perro perro) {
        perros.add(perro);
    }

    public void agregarGatoADueño(Gato gato){
        gatos.add(gato);
    }
}
