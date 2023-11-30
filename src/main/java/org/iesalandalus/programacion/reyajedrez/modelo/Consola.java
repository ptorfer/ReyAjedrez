package org.iesalandalus.programacion.reyajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    /*constructor para esta clase con su visibilidad adecuada, teniendo en cuenta
    que será una clase de utilidades que sólo contendrá métodos estáticos.*/

    private Consola() {
    }

    public static mostrarMenu() {
        System.out.println("1. Crear rey por defecto.");
        System.out.println("2. Crear rey eligiendo el color.");
        System.out.println("3. Mover.");
        System.out.println("4. Salir.");

    }

    public static int elegirOpcionMenu (){
        System.out.println("Elige una opción del menú.");
        int numeromenu = Entrada.entero();
        return numeromenu;
    }


}

