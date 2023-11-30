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

    public static Color elegirOpcion (){
        Color color;
        System.out.println("Elige blanco o negro.");


        do {
            color=Entrada.cadena()
            }while (color !=Color.BLANCO && color !=Color.NEGRO);

            return color;

        }

//Mostrar direcciones

    public static mostrarMenuDirecciones() {
        System.out.println("1. Norte.");
        System.out.println("2. Noreste.");
        System.out.println("3. Este.");
        System.out.println("4. Sureste.");
        System.out.println("5. Sur.");
        System.out.println("6. Suroeste.");
        System.out.println("7. Oeste.");
        System.out.println("8. Noroeste.");
        System.out.println("7. Enroque corto.");
        System.out.println("8. Enroque largo.");

    }




}

