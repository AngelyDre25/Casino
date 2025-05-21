/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Negocio.Carta;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Angely
 */
public class Partida {

    private Jugada myJugada[];
    private int numPartida;
    private String fecha;
    private String ganador;
    private int puntaje;
    private int valorCancelado;
    private Baraja myBaraja;

    public Partida(int numPartida, String fecha) {
        this.myJugada = new Jugada[2];
        this.numPartida = numPartida;
        this.fecha = fecha;
        this.myBaraja = new Baraja();
    }
    
    public void generarCartasIniciales(Jugador jugador1, Jugador jugador2, int valorApuesta1, int valorApuesta2) {

        Carta carta1 = this.myBaraja.getCarta();
        Carta carta2 = this.myBaraja.getCarta();
        Carta cartas1[] = {carta1, carta2};
        
        Carta carta3 = this.myBaraja.getCarta();
        Carta carta4 = this.myBaraja.getCarta();
        Carta cartas2[] = {carta3, carta4};
        
        myJugada[0] = new Jugada(jugador1, cartas1, valorApuesta1);
        myJugada[1] = new Jugada(jugador2, cartas2, valorApuesta2);

    }

    public ArrayList<Carta> getCartasDisponibles() {
        return myBaraja.getMyCartas();
    }

}
