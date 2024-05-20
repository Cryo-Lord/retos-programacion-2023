import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class Cryo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in) ;
        System.out.println("Ingresa la palabra:");

        String dato = keyboard.nextLine();
        String resultado = change(dato.toLowerCase());

        System.out.println("Traducción: " + resultado);
        keyboard.close();
    }

    public static String change(String entry) {
        char[] tamarindo = entry.toCharArray(); 

        HashMap<Character, String> diccionario = new HashMap<Character, String>();
        char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] l337 = {"4","I3","[",")","3","|=","&","#","1",",_|",">|","1","/\\/\\","^/","0","|*","(_,)","I2","5","7","(_)","\\/","\\/\\/","><","j","2"};
        for (int l = 0; l < abecedario.length; l++) 
        {
            diccionario.put(abecedario[l],l337[l]);
        } 
        
        String patata = "";
        for (char i: tamarindo) {
            patata += diccionario.get(i); 
        }
        
        return patata;
    }
}