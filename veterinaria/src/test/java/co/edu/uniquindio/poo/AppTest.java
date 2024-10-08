package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AppTest {
    private Leon leon;
    private Perro perro;
    private Gato gato;
    private AveSalvaje aveSalvaje;
    private AveDomestica aveDomestica;
    private Dueño dueño;
    private ClinicaVeterinaria clinica;

    @BeforeEach
    public void setUp() {
        leon = new Leon("Leon Calvo", 6, 130.5, "Negra", "si");
        perro = new Perro("Tayson", 5, 5.5, "Pitbull");
        gato = new Gato("Mona", 12, 2.5, "Blanco");
        aveSalvaje = new AveSalvaje("Aguila Calva", 3, 6, 12, 1.5);
        aveDomestica = new AveDomestica("Sirilo", 1, 0.5, "Canario");
        dueño = new Dueño("Daniel", "3001122232");
        clinica = new ClinicaVeterinaria("Los Peludos", "Cra14 10 12");
    }

    @Test
    public void testLeonConstructor() {
        assertEquals("Leon Calvo", leon.getNombre());
        assertEquals(6, leon.getEdad());
        assertEquals(130.5, leon.getPeso());
        assertEquals("Negra", leon.getColorMelena());
        assertEquals("si", leon.getCazador());
    }

    @Test
    public void testPerroConstructor() {
        assertEquals("Tayson", perro.getNombre());
        assertEquals(5, perro.getEdad());
        assertEquals(5.5, perro.getPeso());
        assertEquals("Pitbull", perro.getRaza());
    }

    @Test
    public void testGatoConstructor() {
        assertEquals("Mona", gato.getNombre());
        assertEquals(12, gato.getEdad());
        assertEquals(2.5, gato.getPeso());
        assertEquals("Blanco", gato.getColor());
    }

    @Test
    public void testAveSalvajeConstructor() {
        assertEquals("Aguila Calva", aveSalvaje.getNombre());
        assertEquals(3, aveSalvaje.getEdad());
        assertEquals(6, aveSalvaje.getPeso());
        assertEquals(12, aveSalvaje.getDistanciaVuelo());
        assertEquals(1.5, aveSalvaje.getTamañoAlas());
    }

    @Test
    public void testAveDomesticaConstructor() {
        assertEquals("Sirilo", aveDomestica.getNombre());
        assertEquals(1, aveDomestica.getEdad());
        assertEquals(0.5, aveDomestica.getPeso());
        assertEquals("Canario", aveDomestica.getRaza());
    }

    @Test
    public void testDueñoConstructor() {
        assertEquals("Daniel", dueño.getNombre());
        assertEquals("3001122232", dueño.getTelefono());
    }

    @Test
    public void testAgregarPerroADueño() {
        dueño.agregarPerroADueño(perro);
        assertEquals(1, dueño.getPerros().size());
        assertEquals(perro, dueño.getPerros().get(0));
    }

    @Test
    public void testAgregarGatoADueño() {
        dueño.agregarGatoADueño(gato);
        assertEquals(1, dueño.getGatos().size());
        assertEquals(gato, dueño.getGatos().get(0));
    }

    @Test
    public void testClinicaVeterinariaConstructor() {
        assertEquals("Los Peludos", clinica.getNombre());
        assertEquals("Cra14 10 12", clinica.getDireccion());
    }

    @Test
    public void testAgregarAnimalAVeterinaria() {
        clinica.agregarAnimalAVeterinaria(perro);
        assertEquals(1, clinica.getAnimales().size());
        assertEquals(perro, clinica.getAnimales().get(0));
    }
}
