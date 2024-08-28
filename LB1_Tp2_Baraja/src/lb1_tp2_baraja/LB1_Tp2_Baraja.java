package lb1_tp2_baraja;



public class LB1_Tp2_Baraja {

    public static void main(String[] args) {


        Baraja baraja = new Baraja();

        
        baraja.mostrarMazo();

        System.out.println("----------------------");
        baraja.barajar();
        
        System.out.println(baraja.siguienteCarta());
        System.out.println(baraja.siguienteCarta());
        System.out.println(baraja.siguienteCarta());
        System.out.println(baraja.siguienteCarta());
        System.out.println("Le quedan: " + baraja.getContador());



    }
}
