package metodos;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        // replace
        // upperCase
        // lowerCase
        // indexOf
        // charAt
        // length'
        // isEmpty
        // contains
        String nome = "Alura";

        String outroNome = nome.replace("Al", "aLL");
        String upperNome = nome.toUpperCase();
        String lowerNome = nome.toLowerCase();

        // Qual caracter exite nessa posicaoo
        char carcterNessaPosicaoNome = nome.charAt(2);
        int posicaoNome = nome.indexOf("ur");
        String sub = nome.substring(1);
        System.out.println(nome.length());
        System.out.println();

        for(int i=0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
        System.out.println();
        String vazio = "";
        System.out.println("Esta vazo? " + vazio.isEmpty());

        String outroVazio = " ";
        System.out.println("Esta vazio?: " +outroVazio.isEmpty());

        String outroOutroVzio = " ";
        System.out.println("Esta vario? "+outroOutroVzio.trim().isEmpty());

        String nomeMeu = "Ana";
        System.out.println("Contem? " +nomeMeu.contains("Ann"));

        // split
        String teste= "Ana 000 1111";
        String nomeSplit[] = teste.split(" ");
        System.out.println(nomeSplit[2]);


        System.out.println(outroNome);
        System.out.println(upperNome);
        System.out.println(lowerNome);
        System.out.println(carcterNessaPosicaoNome);
        System.out.println(posicaoNome);
        System.out.println(sub);

    }
}
