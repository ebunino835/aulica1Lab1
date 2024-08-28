package lb1_tp2_baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    public Baraja() {

    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + cartas +
                '}' + "----------------";
    }


    static ArrayList<Carta> cartas = new ArrayList<>();

    //Metodos

    public void crearMazoEspanol(){
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};

        for (String palo : palos) {
            for (int valor = 1; valor <=7 ; valor++) {
                Carta carta = new Carta(valor, palo);
                cartas.add(carta);
            }

            for (int valor = 10; valor <=12 ; valor++) {
                Carta carta = new Carta(valor, palo);
                cartas.add(carta);
            }
        }
    }

    public void mostrarMazo() {

        for (Carta carta : cartas) {
            System.out.println(carta.toString());

        }

    }

    public void agregarCartas(Carta carta){

        cartas.add(carta);
    }

    public void barajar(){

        Collections.shuffle(cartas);

        System.out.println("Luego de barajar");
        for (Carta carta : cartas) {

            System.out.println(carta.toString());
        }

    }

    

}
