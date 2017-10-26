package exemploatributosobxectos;

import java.util.Scanner;

public class ExemploAtributosObxectos {

    
    public static void main(String[] args) {
        Conta obxConta = new Conta();
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduce el nombre del titular:");
        System.out.println(obxConta.toString());
    }
    
}
