package lb1_tp2_baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    public Baraja() {
    }

    ArrayList<Carta> cartas = new ArrayList<>();

    //Metodos
    public void agregarCartas(Carta carta){

        cartas.add(carta);
    }

    public void barajar(){

        Collections.shuffle(cartas);

        System.out.println("Luego de barajar: " + cartas);
        
    }
    
}
