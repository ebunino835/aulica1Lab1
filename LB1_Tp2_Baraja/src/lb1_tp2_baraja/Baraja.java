package lb1_tp2_baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    public Baraja() {
    }

    ArrayList<Carta> cartas = new ArrayList<>();

    //Metodos
    public static void agregarCartas(Carta carta){

        cartas.add(carta)
    }

    public static void barajar(ArrayList cartas){

        Collections.shuffle(cartas);

        system.out.println("Luego de barajar: " + cartas);
        
    }
    
}
