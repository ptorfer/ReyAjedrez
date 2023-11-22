package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");
    private String CadenaAMostrar;
    private Color(String CadenaAMostrar) {
        this();
        this.CadenaAMostrar = CadenaAMostrar;
    }
    @Override
    public String toString() {
        return CadenaAMostrar;
    }
}



