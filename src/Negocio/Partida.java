/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

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

    public Partida(Jugada[] myJugada, int numPartida, String fecha, String ganador, int puntaje, int valorCancelado) {
        this.myJugada = new Jugada[2];
        this.numPartida = numPartida;
        this.fecha = fecha;
        this.ganador = ganador;
        this.puntaje = puntaje;
        this.valorCancelado = valorCancelado;
    }
}
