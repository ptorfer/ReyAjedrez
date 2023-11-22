package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;
public class Posicion {
    //Creación de atributos
    private int fila;
    private char columna;

    //Creación método set de filas y columnas
    private void setFila(int fila) {
        if (fila > 0 || fila < 9) {
            this.fila = fila;
        } else {
            throw new IllegalArgumentException("Por favor introduce un número del 1 " +
                    "al 8.");
        }
    }
    private void setColumna(char columna) {
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
    public Posicion(int fila,char columna) {
        setFila(fila);
        setColumna(columna);
    }

    //Creación constructor copia de la clase
    public Posicion(Posicion posicion) {
        fila=posicion.fila;
        columna=posicion.columna;
    }

    //Método equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Posicion posicion2)) return false;
        return fila == posicion2.fila && columna == posicion2.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }
}


