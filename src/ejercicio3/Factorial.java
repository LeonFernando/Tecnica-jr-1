/*
3.- De un programa que se supone que retorna el factorial de un numero, revisar el codigo e indicar los
correciones

R = No es posible regresar un double ya que solo es posible hacer factorial de numeros enteros

private Double calculate(Integer i) {  //No es posible retornar un double ya que solo es posible hacer factorial de numeros enteros
if(i = 0) {                            // Se debe comparar los valores (==) no igualarlos(=)
1;                                     //Hace falta la palbra reservada return
}
if(i = 1) {                            // Se debe comparar los valores (==) no igualarlos(=)
return 1;
}
Long f = i + calculate(i--)            // Se debe hacer un predecremento (--i) no un posdecremento (i--)
return f;                              // Se debe convertir a int el retorno o cambiar el parametro de entrada a Long
}

*/

package ejercicio3;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial de tipo Long = " + calculate(3L)); //Se señala la factorial
        System.out.println("Factorial de tipo int = " + calculate(4));
    }

    private static Long calculate(Long i) {

        if (i == 0) {
            return 1L;
        } else if (i == 1) {
            return 1L;
        }

        long f = (long) (i * calculate(--i));
        return f;
    }

    private static int calculate(int i) {

        if (i == 0) {
            return 1;
        } else if (i == 1) {
            return 1;
        }

        long f = i * calculate(--i);
        return (int) f;
    }
}
