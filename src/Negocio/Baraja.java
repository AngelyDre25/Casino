/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Angely
 */
public class Baraja {
  
    private ArrayList<Carta> myCartas;
    
    public Baraja(){
    this.myCartas = new ArrayList<>();
    
        String palo[] = {"\u2665", "\u2666", "\u2663", "\u2660"};
        String numero[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        for (String p : palo) {
            for (String num : numero) {
                Carta carta = new Carta(p, num);
                int valor;

                switch (num) {
                    case "A":
                        valor = 11;
                        break;
                    case "J":
                    case "Q":
                    case "K":
                        valor = 10;
                        break;
                    default:
                        valor = Integer.parseInt(num);
                        break;
                }

                carta.setValor(valor);
                myCartas.add(carta);
            }
        }
    }
    
    public ArrayList<Carta> getMyCartas() {
        return myCartas;
    }
}
