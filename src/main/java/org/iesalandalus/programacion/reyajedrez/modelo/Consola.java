package org.iesalandalus.programacion.reyajedrez.modelo;

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
}
