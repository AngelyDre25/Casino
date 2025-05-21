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
    
    public void generarCartasIniciales(Baraja baraja){
       Random random = new Random();
       ArrayList<Carta> cartasDisponibles = baraja.getMyCartas();
       
       int carta1 = random.nextInt(cartasDisponibles.size());
       int carta2 = random.nextInt(cartasDisponibles.size());
       
       if(carta1 == carta2){
           carta2 = random.nextInt(cartasDisponibles.size());
       } 
       myCartas[0] = cartasDisponibles.get(carta1);
       myCartas[1] = cartasDisponibles.get(carta2);
    }
    
    public Carta[] getCartas(){
        return myCartas;
    }
    
    
}
