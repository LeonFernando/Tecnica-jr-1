/*
4.- De un programa que convierte las letras de un enunciado a sus espejo (a por z, b por y … etc), quien lo
hizo solicita tu revisión, pero tuvo que partir por una emergencia, ¿podrías corregir también el código?

public static void byteArray(String s) {
String[] abc = "abcdefghijklmnopqrstuvwxyz".split("");
String [] str = s.split(" ");
ArrayList<String> aabc = new ArrayList(abc)
String nstr = "";
for ( ss: str) {
int idx = abc.indexOf(ss);
if(idx >= 0)
nstr += abc[(abc.lenght - idx) - 1]
nstr = ss;
}
*/


package ejercicio4;

import java.util.ArrayList;

public class EnunciadoEspejo {

    public static void main(String[] args) {
        byteArray("b");
    }

    public static void byteArray(String s) {

        String[] abc = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] str = s.split("");
        ArrayList<String> aabc = new ArrayList(abc.length);
        String nstr = "";
        
        for (String ss  : str) {
            int idx = aabc.indexOf(ss);
            
            if (idx <= 0) {
                          
                nstr += abc[(str.length - idx) + abc.length - 4 ]; //Necesito cambiar el numero final imprimir letra espejo
                System.out.println(nstr);

            }
            
            nstr = ss;
            System.out.println(nstr);
        }


    }
}
