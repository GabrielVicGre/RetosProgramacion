/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

package programa_2;

public class PasswordGenerator {

    public static void Iniciar(){
        for (int j=1; j<=40; j++){
            int lengthPassword = calculaNumAleatorio(8,16);
            String resPassword = "";
            for (int i=1; i<=lengthPassword; i++){
                resPassword = resPassword + generaCaracter();
            }
            System.out.println("Password generada: " + resPassword);
        }
    }

    public static int calculaNumAleatorio(int min, int max){
        int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
        return numeroAleatorio;
    }

    public static char generaCaracter(){
        int indice;
        char caracterAleatorio = '\u0000';
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x',
                'y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] numeros = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] simbolos = {'@', '#', '$', '%', '&', '*', '!'};

        int tipoVector = calculaNumAleatorio(1,3);
        switch (tipoVector){
            case 1:
                indice = calculaNumAleatorio(0, letras.length-1);
                caracterAleatorio = letras[indice];
                break;
            case 2:
                indice = calculaNumAleatorio(0, numeros.length-1);
                caracterAleatorio = numeros[indice];
                break;
            case 3:
                indice = calculaNumAleatorio(0, simbolos.length-1);
                caracterAleatorio = simbolos[indice];
                break;
        }
        return caracterAleatorio;
    }
}
















