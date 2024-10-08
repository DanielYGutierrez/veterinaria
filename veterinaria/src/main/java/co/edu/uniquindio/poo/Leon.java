package co.edu.uniquindio.poo;

public class Leon extends Animal {
    private String colorMelena;
    private String cazador;
    
    public Leon(String nombre, int edad, double peso, String colorMelena, String cazador) {
        super(nombre, edad, peso);
        this.colorMelena = colorMelena;
        this.cazador = cazador;
    }

    public String getColorMelena() {
        return colorMelena;
    }

    public void setColorMelena(String colorMelena) {
        this.colorMelena = colorMelena;
    }

    public String getCazador() {
        return cazador;
    }

    public void setCazador(String cazador) {
        this.cazador = cazador;
    }

    @Override
    public String toString() {
        return "Leon: \nNombre: " + nombre + "\n Edad: " + edad + "\n Peso: " + peso + "\n Cazador: " + cazador + "\n Color Melena: " + colorMelena;
    
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
