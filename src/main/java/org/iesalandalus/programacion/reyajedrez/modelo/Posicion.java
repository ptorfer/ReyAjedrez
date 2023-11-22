package org.iesalandalus.programacion.reyajedrez.modelo;

public class Posicion {
    //Creación de atributos
    private int fila;
    private char columna;

    //Creación método set de filas y columnas
    public void setFila(int fila) {
        if (fila > 0 || fila < 9) {
            this.fila = fila;
        } else {
            throw new IllegalArgumentException("Por favor introduce un número del 1 " +
                    "al 8.");
        }
    }
    public void setColumna(char columna) {
        if (columna >= 'a' || columna <= 'h') {
            this.columna = columna;
        } else {
            throw new IllegalArgumentException(("Por favor introduce una letra de " +
                    "la a a la h.");
        }
    }

    //Creación método get de filas y columnas
    public int getfila() {
        return fila;
    }

    public char getcolumna() {
        return columna;
    }

    //Creación de constructor
    private Posicion(int fila,char columna) {
        setFila(fila);
        setColumna(columna);
    }
}


