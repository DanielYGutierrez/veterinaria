package co.edu.uniquindio.poo;


public class App {
    public static void main(String[] args) {
        ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria("Los Peludos", "Cra14 10 12");
        ClinicaVeterinaria.mostrarMensaje(clinicaVeterinaria.toString());

        Perro perro1 =new Perro("Tayson", 5, 5.5, "Pitbull");
        Perro.mostrarMensaje(perro1.toString());

        Perro perro2 = new Perro("Princesa", 6, 8.2, "Labrador");
        Perro.mostrarMensaje(perro2.toString());
        
        Gato gato1 = new Gato("Mona", 12, 2.5, "Blanco");
        Gato.mostrarMensaje(gato1.toString());

        Gato gato2 = new Gato("Calva", 2, 2.5, "Negro");
        Gato.mostrarMensaje(gato2.toString());

        AveDomestica aveDomestica = new AveDomestica("Sirilo", 1, 0.5, "Canario");
        AveDomestica.mostrarMensaje(aveDomestica.toString());

        AveSalvaje aveSalvaje = new AveSalvaje("Aguila Calva", 3, 6, 12, 1.5);
        AveSalvaje.mostrarMensaje(aveSalvaje.toString());

        Leon leon =new Leon("Leon Calvo", 6, 130.5, "Negra", "si");
        Leon.mostrarMensaje(leon.toString());



        Dueño dueño1 = new Dueño("Daniel", "3001122232");
        dueño1.agregarPerroADueño(perro1);
        dueño1.agregarGatoADueño(gato2);
        Dueño.mostrarMensaje(dueño1.toString());
        clinicaVeterinaria.agregarAnimalAVeterinaria(perro1);
        clinicaVeterinaria.agregarAnimalAVeterinaria(gato2);

        Dueño dueño2 = new Dueño("Camila", "3155445551");
        dueño2.agregarGatoADueño(gato1);
        dueño2.agregarPerroADueño(perro2);
        Dueño.mostrarMensaje(dueño2.toString());
        clinicaVeterinaria.agregarAnimalAVeterinaria(gato2);
        clinicaVeterinaria.agregarAnimalAVeterinaria(perro2);



    }
}
