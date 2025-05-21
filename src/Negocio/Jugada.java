/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Angely
 */
public class Jugada {
    private Jugador myJugador;
    private Carta myCartas[];
    private int puntaje;
    private String nombre;
    private int valorApuesta;

    public Jugada(Jugador myJugador, Carta[] myCartas, int puntaje, String nombre, int valorApuesta) {
        this.myJugador = myJugador;
        this.myCartas = new Carta[5];
        this.puntaje = puntaje;
        this.nombre = nombre;
        this.valorApuesta = valorApuesta;
    }
    
    
    
    
}
