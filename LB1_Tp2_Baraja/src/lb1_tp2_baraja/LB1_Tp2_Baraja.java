package lb1_tp2_baraja;



public class LB1_Tp2_Baraja {

    public static void main(String[] args) {


        Baraja baraja = new Baraja();

        System.out.println("Mazo completo: ");
        baraja.mostrarMazo();
        System.out.println("----------------------");

        System.out.println("Luego de barajar: ");
        baraja.barajar();
        System.out.println("----------------------");

        System.out.println(baraja.siguienteCarta());
        System.out.println(".....");
        System.out.println(baraja.siguienteCarta());
        System.out.println(".....");
        System.out.println(baraja.siguienteCarta());
        System.out.println(".....");
        System.out.println(baraja.siguienteCarta());
        System.out.println("----------------------");


        System.out.println("Cantidad de cartas disponibles en el mazo: ");
        baraja.cartasDisponibles();
        System.out.println("----------------------");

        System.out.println("El programa da cartas: ");
        baraja.darCartas(2);
        System.out.println("----------------------");

        System.out.println("Cantidad de cartas disponibles en el mazo: ");
        baraja.cartasDisponibles();
        System.out.println("----------------------");

        System.out.println("Cartas que han salido");
        baraja.cartasMonton();
        System.out.println("----------------------");

        System.out.println("Cartas restantes del mazo");
        baraja.mostrarBaraja();
        System.out.println("----------------------");

        System.out.println("Programa finalizado");
    }
}
