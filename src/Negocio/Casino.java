/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Negocio;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Angely
 */
public class Casino {

    private int monto;
    private ArrayList<Jugador> listaJugadores;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Persona> listaPersonas;
    private Partida myPartida;
    int partidaActual;

    public Casino(int monto) {

        this.monto = monto;
        this.listaJugadores = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.partidaActual = 1;
    }

    public String crearPartido(String cedula1, String cedula2, int apuesta1, int apuesta2) {
        if (this.listaEmpleados.isEmpty()) {
            return "Debe registrar mínimo un crupier";
        } else {
            String hoy = LocalDate.now().toString();
            Persona persona1 = this.buscarPersonaPorCedula(cedula1);
            Persona persona2 = this.buscarPersonaPorCedula(cedula2);
            this.myPartida = new Partida(this.partidaActual, hoy);
            this.myPartida.generarCartasIniciales(persona1, persona2, apuesta1, apuesta2);
            partidaActual++;
            return "";
        }
    }

    public boolean validarCedula(String cedula) {
        boolean valida = false;
        for (Persona persona : listaPersonas) {
            if (persona.getCedula().equals(cedula)) {
                return valida = true;
            }
        }
        return valida;
    }

    public String registrarJugador(String nombre, String cedula, String telefono) {

        if (validarCedula(cedula)) {
            return "Ya existe ese número de cédula";
        }
        Jugador nuevoJugador = new Jugador(telefono, nombre, cedula);
        listaJugadores.add(nuevoJugador);
        listaPersonas.add(nuevoJugador);

        return "Registro exitoso";

        /*for (Persona persona : listaPersonas) {
            if (persona instanceof Jugador) {
                Jugador jugador = (Jugador) persona;
            }
        }*/
    }

    public String registrarEmpleado(String nombre, String cedula) {

        if (validarCedula(cedula)) {
            return "Ya existe este número de cédula";
        } else {
            Empleado nuevoEmpleado = new Empleado(nombre, cedula);
            listaEmpleados.add(nuevoEmpleado);
            listaPersonas.add(nuevoEmpleado);
            return "Registro exitoso";
        }
    }

}
