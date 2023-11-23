package org.iesalandalus.programacion.reyajedrez.modelo;
import java.util.Objects;

public class Rey {
    //Creación de atributos
    private Color color; //pongo en minuscula color y posicion porque se nombran
                         //en minúscula los atributos
    private Posicion posicion;
    private int totalMovimientos;

    //Métodos set y get
    private void setColor(Color color) {
        this.color = Objects.requireNonNull(color, "El color del rey" +
                                                            " no puede ser nulo.");
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = Objects.requireNonNull(posicion, "La posición " +
                                                       " del rey no puede ser nula.");

    public int color() {
        return color;

    public Posicion getPosicion() {
        return posicion;

    //constructor por defecto para esta clase que cree un rey blanco en la posición "1e"
    public Rey(){
        color = Color.BLANCO;
        posicion = new Posicion(1,'e');
    }




}



