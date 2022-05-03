/*
De una lista de números se necesita saber las ocurrencias de ciertos dígitos (0-9).
Se de entregar una lista de elementos con 2 datos, el dígito a buscar y la ocurrencia de este
Por ejemplo:
int[] integers = [-18, -31, 81, -19, 111, -888]
int[] digits = [1, 8, 4]
ocurrencias(integers, digits) == [[1, 7], [8, 5], [4, 0]]
 */
package ejercicio2;

import java.util.Arrays;

public class OcurrenciaNumeros {

    static int[] integers = {-18, -31, 81, -19, 111, -888};
    static int[] digits = {1, 8, 4};
    //static char[] a = {1, 8, 3, 1, 1, 8, 1, 9, 1, 1, 1, 8, 8, 8};
    //static char[] b = {-18, -31, 81, -19, 111, -888};

    public static void main(String[] args) {

        ocurrenciaElemento(tranformarCadena(), digits);

    }

    public static final char[] tranformarCadena() {

        String arrayToString = Arrays.toString(integers);
        String digitsToString = Arrays.toString(digits);

        String cadenaSinComas = arrayToString.replace(", ", "");
        cadenaSinComas = cadenaSinComas.replace(",", ", ");
        cadenaSinComas = cadenaSinComas.replace("-", "");
        cadenaSinComas = cadenaSinComas.replace("", ", ");
        cadenaSinComas = cadenaSinComas.replace(", ", ",");
        cadenaSinComas = cadenaSinComas.replace(",[,", "[");
        cadenaSinComas = cadenaSinComas.replace(",],", "]");
        cadenaSinComas = cadenaSinComas.replace(",", ", ");
        
//      String[] arrayOfStrings = cadenaSinComas.split("-,");
//      String arraysToStrings = Arrays.stream(arrayOfStrings).collect(Collectors.joining(""));

        char[] arrayChar = cadenaSinComas.toCharArray();
        char[] charDigits = digitsToString.toCharArray();

        System.out.println(arrayChar);
        System.out.println(charDigits);

        return arrayChar;
    }

    public static void ocurrenciaElemento(char[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    System.out.println(array2[j] + " " + i);
                }
            }

        }

    }

}
