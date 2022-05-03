/*
1.- En una reunión de amigos deciden realizar una pirámide de refrescos. Todos juntan su dinero y de una
suma total a la que llamaremos colecta y revisan los precios de las latas de refresco, para seleccionar un
precio.
La pirámide se formará de la siguiente manera, piso más alto sólo tendrá 1 lata, el siguiente piso 4 latas, el
siguiente 9 latas (latas_por_piso = piso al cuadrado). Se deben descartar los pisos incompletos.
Nuestra incógnita es cuántos pisos de latas de un cierto precio resultarán con la colecta.
Por ejemplo:
piramide(colecta, precio) = # de pisos
piramide(1500, 2) = 12 //pisos
 */
package ejercicio1;

public class Piramide {
    
    private static final double PRECIO_LATA = 8.9;
    private static final double COLECTA = 1500 / PRECIO_LATA;
    private static final int PISO_CUADRADO = (int) Math.sqrt(COLECTA);
    private static final int latas_por_piso = (int) Math.pow(PISO_CUADRADO, 2);

    public static void pyramid(int noLatas) {
        
        System.out.println("Numero de pisos = " + PISO_CUADRADO);

        for (int i = 0; i <= PISO_CUADRADO; i++) {
            
            
            for (int j = PISO_CUADRADO; j >= i; j--) {
                System.out.print("");
            }

            for (int k = 0; k <= i*i-1; k++) {
                System.out.print(" *");
            }
            
            System.out.println("");
        }

    }

    public static double getPRECIO_LATA() {
        return PRECIO_LATA;
    }

    public static double getCOLECTA() {
        return COLECTA;
    }

    public static int getPISO_CUADRADO() {
        return PISO_CUADRADO;
    }

    public static int getLatas_por_piso() {
        return latas_por_piso;
    }

}
