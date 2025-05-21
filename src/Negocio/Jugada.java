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
    private Empleado myEmpleado;
    private Carta myCartas[];
    private int puntaje;
    private int valorApuesta;

    public Jugada(Jugador myJugador, Carta[] myCartas, int valorApuesta) {
        this.myJugador = myJugador;
        this.myCartas = new Carta[5];
        for(int i=0; i<2; i++){
            this.myCartas[i] = myCartas[i];
        }
        this.valorApuesta = valorApuesta;
    }
    
    
    
    
}
