package test.examen;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.examen.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExamenTest {

    private static double notaTotal = 0.0;

    // 1. Test de la clase Agenda. 3 puntos
    @Test
    public void testAgregarContacto() {
        Agenda agenda = new Agenda();
        Contacto c = new Contacto("Pepe", "123", "pepe@gmail.com");
        agenda.agregarContacto(c);

        assertEquals(1, agenda.getContactos().size());
        System.out.println("[AgendaTest] testAgregarContacto PASSED (+1.0)");
        notaTotal += 1.0;
    }

    @Test
    public void testEliminarContacto() {
        Agenda agenda = new Agenda();
        agenda.agregarContacto(new Contacto("Ana", "111", "ana@correo.com"));

        boolean eliminado = agenda.eliminarContacto("ana");
        assertTrue(eliminado);
        assertEquals(0, agenda.getContactos().size());
        System.out.println("[AgendaTest] testEliminarContacto PASSED (+1.0)");
        notaTotal += 1.0;
    }

    @Test
    public void testBuscarContacto() {
        Agenda agenda = new Agenda();
        agenda.agregarContacto(new Contacto("Carlos", "222", "carlos@mail.com"));
        agenda.agregarContacto(new Contacto("Carla", "333", "carla@mail.com"));

        List<Contacto> resultados = agenda.buscarContacto("car");
        Assertions.assertEquals(2, resultados.size());
        System.out.println("[AgendaTest] testBuscarContacto PASSED (+1.0)");
        notaTotal += 1.0;
    }

    // 2. Test de la clase ContadorPalabras. 1,5 puntos
    @Test
    public void testContarPalabras() {
        String ruta = "resources/datos.txt";
        int resultado = src.examen.ContadorPalabras.contarPalabras(ruta);
        Assertions.assertTrue(resultado >= 4, "Debe haber al menos 4 palabras en el archivo de prueba.");
        System.out.println("[ContadorPalabrasTest] testContarPalabras PASSED (+1.0)");
        notaTotal += 1.0;
    }

    // 3. Test de la clase ListadorDirectorios. 1 punto
    @Test
    public void testListarContenido() {
        String ruta = "resources/";
        String[] resultado = ListadorDirectorios.listarContenido(ruta);

        assertNotNull(resultado, "El resultado no debe ser nulo.");
        Assertions.assertTrue(resultado.length >= 1, "Debe haber al menos un archivo en el directorio.");
        System.out.println("[ListadorDirectoriosTest] testListarContenido PASSED (+1.0)");
        notaTotal += 1.0;
    }

    // 4. Test de la clase CopiaBinaria. 1 punto
    @Test
    public void testCopiaImagen() {
        String origen = "resources/imagen_original.png";
        String destino = "resources/imagen_copia.png";

        boolean exito = CopiaBinaria.copiar(origen, destino);

        File archivoOriginal = new File(origen);
        File archivoCopia = new File(destino);

        Assertions.assertTrue(exito, "La copia debe completarse correctamente.");
        Assertions.assertTrue(archivoCopia.exists(), "El archivo de destino debe existir.");
        Assertions.assertEquals(archivoOriginal.length(), archivoCopia.length(), "Ambos archivos deben tener el mismo tamaño.");
        System.out.println("[CopiaBinariaTest] testCopiaImagen PASSED (+1.0)");
        notaTotal += 1.0;
    }

    // 5. Test de la clase BuscadorPatrones. 1,5 puntos
    @Test
    public void testContarCoincidencias() {
        String ruta = "resources/datos.txt";
        String patron = "examen";

        int resultado = BuscadorPatrones.contarCoincidencias(ruta, patron);
        Assertions.assertTrue(resultado >= 1, "La palabra 'examen' debe aparecer al menos una vez.");
        System.out.println("[BuscadorPatronesTest] testContarCoincidencias PASSED (+1.0)");
        notaTotal += 1.0;
    }

    // 6. Test de la clase SerializadorObjetos. 2 puntos
    @Test
    public void testSerializacionYDeserializacion() {
        String ruta = "resources/personas.dat";

        List<Persona> personasOriginal = new ArrayList<>();
        personasOriginal.add(new Persona("Juan", 28));
        personasOriginal.add(new Persona("Lucía", 34));

        SerializadorObjetos.guardarPersonas(personasOriginal, ruta);

        File archivo = new File(ruta);
        Assertions.assertTrue(archivo.exists(), "El archivo debe existir tras la serialización.");

        List<Persona> personasCargadas = SerializadorObjetos.cargarPersonas(ruta);
        Assertions.assertEquals(2, personasCargadas.size(), "Debe haber 2 personas en la lista cargada.");
        Assertions.assertEquals("Juan", personasCargadas.get(0).getNombre());
        System.out.println("[SerializadorObjetosTest] testSerializacionYDeserializacion PASSED (+1.0)");
        notaTotal += 1.0;
    }

    // 7. Test de la clase GenerarPalindromos. 2 puntos
    @Test
    public void testGenerarPalindromos() throws IOException {
        String entrada = "resources/texto_palindromos.txt";
        String salida = "resources/palindromos_encontrados.txt";

        PalabrasPalindromas.generarPalindromos(entrada, salida);

        List<String> lineas = Files.readAllLines(new File(salida).toPath());

        // Comprobación de algunos palíndromos clave esperados
        assertTrue(lineas.contains("anita"));
        assertTrue(lineas.contains("acaso"));
        assertTrue(lineas.contains("hubo"));
        assertTrue(lineas.contains("reconocer"));
        assertTrue(lineas.contains("radar"));
        assertTrue(lineas.contains("ojo"));
        assertTrue(lineas.contains("otto"));
        assertTrue(lineas.contains("ese"));
        assertTrue(lineas.contains("yo"));
        assertTrue(lineas.contains("menem"));

        // Comprobación de línea total al final
        assertTrue(lineas.get(lineas.size() - 1).startsWith("Total:"));
        System.out.println("[GenerarPalindromosTest] testContarCoincidencias PASSED (+2.0)");
        notaTotal += 2.0;
    }

    @AfterAll
    public static void mostrarNotaTotal() {
        System.out.println("\nNota final: " + notaTotal);
    }
}
