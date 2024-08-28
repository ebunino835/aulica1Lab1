package lb1_tp2_baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    
    private List<Carta> mazo;
    private int contador;
    
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

   
       
    //ArrayList<Carta> cartas = new ArrayList<>();

    
    //Metodos
    
    
    
    /*public void crearMazoEspanol(){
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};

        for (String palo : palos) {
            for (int valor = 1; valor <=7 ; valor++) {
                carta = new Carta(valor, palo);
                cartas.add(carta);
            }

            for (int valor = 10; valor <=12 ; valor++) {
                carta = new Carta(valor, palo);
                cartas.add(carta);
            }
        }
    }*/

    public void mostrarMazo() {

        for (Carta carta : mazo) {
            System.out.println(carta.toString());

        }

    }

      public void barajar(){

        Collections.shuffle(mazo);

        System.out.println("Luego de barajar");
        mostrarMazo();

    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + mazo +
                '}' + "----------------";
    }
    public String siguienteCarta(){
        
        if(mazo.size()>0){
            String aux = mazo.get(0).toString();
            System.out.println("La siguiente carta es: ");
            mazo.remove(0);
            contador= contador-1;
            return aux;
        } else {
            return "No hay más cartas. ";
        }
    }
    
    /*public String siguienteCarta(){
        if(this.contador <40){
            contador = contador+1;
            System.out.println("La siguiente carta es: ");
            return mazo.get(contador).toString();
        } else {
            return "No hay más cartas. ";
        }
            
        //return carta;
    }*/
    
    public void cartasDisponibles(){
        
    }

}
