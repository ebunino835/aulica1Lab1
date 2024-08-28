package lb1_tp2_baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    
    private List<Carta> mazo;
    private int contador;

    //Creo un arrayList para pasar las cartas salientes
    ArrayList<Carta> nCartas = new ArrayList<>();

    //-----------------------------------------------------------------------
    
    public Baraja() {
        this.contador = 40;
        this.mazo = new ArrayList<>();
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        for (String palo : palos) {
            for (int valor = 1; valor <=12 ; valor++) {
                if(valor !=8 && valor !=9){
                    mazo.add(new Carta(valor, palo));
                }
                
            }
        }
    }

    public int getContador() {
        return contador;
    }

    //-----------------------------------------------------------------------

    public void mostrarMazo() {

        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
    }

    //-----------------------------------------------------------------------

      public void barajar(){

        Collections.shuffle(mazo);
        mostrarMazo();

    }

    //-----------------------------------------------------------------------

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + mazo +
                '}';
    }

    //-----------------------------------------------------------------------

    public String siguienteCarta(){
        if(mazo.size()>0){
            String aux = mazo.get(0).toString();
            //Agrego las cartas salientes a un nuevo array
            nCartas.add(mazo.get(0));
            System.out.println("La siguiente carta es: ");
            mazo.remove(0);
            contador= contador-1;
            return aux;
        } else {
            return "No hay más cartas. ";
        }
    }

    //-----------------------------------------------------------------------

    public void cartasDisponibles(){

        System.out.println(mazo.size());

    }

    //-----------------------------------------------------------------------

    public void darCartas(int cantCartas){

        if (mazo.size() > cantCartas){

            for (int i = 0; i < cantCartas; i++) {

                System.out.println("....");
                System.out.println(this.siguienteCarta());

            }

        } else {

            System.out.println("No hay cartas suficientes");

        }

    }

    //-----------------------------------------------------------------------

    public void cartasMonton(){

        for (Carta nCarta : nCartas) {

            System.out.println(nCarta.toString());

        }

    }

    //-----------------------------------------------------------------------

    public void mostrarBaraja(){

        for (Carta carta : mazo) {

            System.out.println(carta.toString());

        }

    }

}
