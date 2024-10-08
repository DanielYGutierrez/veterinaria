package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public int edad;
    public double peso;

    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n Edad: " + edad + "\n Peso: " + peso;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
