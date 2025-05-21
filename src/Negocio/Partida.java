/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

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

    public Partida(Jugada[] myJugada, int numPartida, String fecha, String ganador, int puntaje, int valorCancelado, Baraja baraja) {
        this.myJugada = new Jugada[2];
        this.numPartida = numPartida;
        this.fecha = fecha;
        this.ganador = ganador;
        this.puntaje = puntaje;
        this.valorCancelado = valorCancelado;
        this.myBaraja = baraja;
    }

    public void generarCartasIniciales(Baraja baraja) {
        Random random = new Random();
        ArrayList<Carta> cartasDisponibles = baraja.getMyCartas();

        int carta1 = random.nextInt(cartasDisponibles.size());
        int carta2 = random.nextInt(cartasDisponibles.size());

        if (carta1 == carta2) {
            carta2 = random.nextInt(cartasDisponibles.size());
        }
        myJugada[0] = new Jugada(null, new Carta[]{cartasDisponibles.get(carta1)}, 0, "", 0);
        myJugada[1] = new Jugada(null, new Carta[]{cartasDisponibles.get(carta2)}, 0, "", 0);

    }

    public ArrayList<Carta> getCartasDisponibles() {
        return myBaraja.getMyCartas();
    }

}
