
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class ExamenCompletoTest {

    private double notaTotal = 0.0;

    @Test
    public void testExamenCompleto() {
        System.out.println("===== INICIANDO EVALUACIÓN DEL EXAMEN =====\n");

        evaluarLecturaCSV();
        evaluarRenombradoArchivo();

        System.out.println("\n===== NOTA FINAL DEL EXAMEN: " + String.format("%.1f", notaTotal) + " / 3.0 =====");

        if (notaTotal < 3.0) {
            fail("El examen no ha sido superado completamente.");
        }
    }

    private void evaluarLecturaCSV() {
        System.out.println("[Ejercicio 1] Evaluando la lectura del archivo CSV...");

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(salida));

        try {
            ejercicio1.LectorCSV.main(null);
        } catch (Exception e) {
            System.setOut(originalOut);
            System.out.println("❌ Error al ejecutar LectorCSV: " + e.getMessage());
            return;
        }

        System.setOut(originalOut);
        String output = salida.toString().toLowerCase().replaceAll("\\s+", "");

        boolean cabeceraOK = output.contains("id") && output.contains("precio");
        boolean datosOK = output.contains("teclado") && output.contains("ratón");

        if (cabeceraOK && datosOK) {
            System.out.println("✅ Ejercicio 1 correcto. (+1.5)");
            notaTotal += 1.5;
        } else {
            System.out.println("❌ Faltan elementos en la salida del CSV:");
            if (!cabeceraOK) System.out.println("   - Cabecera incompleta o mal formateada.");
            if (!datosOK) System.out.println("   - Datos del producto no encontrados.");
        }
    }

    private void evaluarRenombradoArchivo() {
        System.out.println("\n[Ejercicio 2] Evaluando el renombrado de archivo...");

        File original = new File("resources/info9.txt");
        File renombrado = new File("resources/datos9.txt");

        // Preparar entorno
        try {
            if (!original.exists()) {
                if (renombrado.exists()) {
                    renombrado.renameTo(original);
                } else {
                    Files.write(Paths.get("resources/info9.txt"), "archivo de prueba".getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al preparar archivo: " + e.getMessage());
            return;
        }

        // Ejecutar
        try {
            ejercicio2.RenombrarArchivo.main(null);
        } catch (Exception e) {
            System.out.println("❌ Error al ejecutar RenombrarArchivo: " + e.getMessage());
            return;
        }

        // Validar
        boolean originalEliminado = !original.exists();
        boolean nuevoExiste = renombrado.exists();

        if (originalEliminado && nuevoExiste) {
            System.out.println("✅ Ejercicio 2 correcto. (+1.5)");
            notaTotal += 1.5;
        } else {
            System.out.println("❌ Error en el renombrado:");
            if (!originalEliminado) System.out.println("   - El archivo original aún existe.");
            if (!nuevoExiste) System.out.println("   - El archivo nuevo no se ha creado.");
        }
    }
}
