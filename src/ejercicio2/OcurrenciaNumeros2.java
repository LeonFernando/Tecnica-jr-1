package ejercicio2;

public class OcurrenciaNumeros2 {
    
    static int aux1;
    static int aux2;
    static char[] integers = {1, 8, 3, 1, 1, 8, 1, 9, 1, 1, 1, 8, 8, 8};
    static int[] digits = {1, 8, 4};

    public static void main(String[] args) {

        ocurrenciaNumero(integers, digits);

        aux1 = integers.length;
        aux2 = digits.length;

        for (int i = 0; i < aux1; i++) {
            for (int j = 0; j < aux2; j++) {
                if (integers[i] == integers[j]) {

                    System.out.println("\nposicion arreglo 1: " + i + " posicion arreglo 2: " + j);

                }

            }

        }

    }

    public static void ocurrenciaNumero(char[] array1, int[] array2) {

        // Recorro el primer array
        for (int i = 0; i < array1.length; i++) {

            // Recorro el segundo array
            for (int j = 0; j < array2.length; j++) {
                // Si coincide hay un elemento repetido
                if (array1[i] == array2[j]) {
                    //System.out.print(array1.length/2);
                    System.out.print("[" + array2[j] + " " + i + "], ");
                    
                    
                    
                }

            }

        }
            System.out.println("");
    }

}
