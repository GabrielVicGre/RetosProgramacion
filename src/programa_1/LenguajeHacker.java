/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

package programa_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LenguajeHacker {


    public static void Iniciar() {

        Scanner consola = new Scanner(System.in);
        String textoOriginal = "";
        boolean terminar = false;
        do{
            System.out.print("Presiona Enter para continuar o escribe 'S' para terminar... ");
            String input = consola.nextLine();
            if (input.equalsIgnoreCase("s")) {
                terminar = true;
            } else if (input.isEmpty()) {
                System.out.print("Ingresa cadena: ");
                textoOriginal = consola.nextLine();
                System.out.println("Cadena convertida: " + convertirALeet(textoOriginal.toUpperCase()));
            } else {
                System.out.println("Entrada no válida, intenta de nuevo. ");
            }
        }while (terminar != true );
    }

    private static String convertirALeet(String texto) {
        Map<String, String> leetMap = new HashMap<>(Map.of(
                "A", "4",
                "B", "8",
                "E", "3",
                "G", "9",
                "I", "1",
                "O", "0",
                "S", "5",
                "T", "7"
        ));

        for (Map.Entry<String, String> entry : leetMap.entrySet()) {
            texto = texto.replace(entry.getKey(), entry.getValue());
        }
        return texto;
    }

}
