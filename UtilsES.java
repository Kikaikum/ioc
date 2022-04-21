import java.util.Scanner;

public class UtilsES {
    static final short POS_NOM = 0;
    static final short POS_PARTIDES_GUANYADES = 1;

    static Scanner scann = new Scanner(System.in);
    
    static int demanarQuantesJugades(){
        
        System.out.println("Cuantas partidas quieres jugar entre 3 y 5");
        int partidas=scann.nextInt();  
        while(partidas < 3 || partidas >5 ){
            System.out.println("Cuantas partidas quieres jugar entre 3 y 5");
            partidas=scann.nextInt();
        }
        return partidas;
    }    
    
    
    static int demanarAposta(){
        System.out.println("Escoge una opcion  0 (PEDRA), 1 (PAPER) o 2 (TISORES)");
        int aposta=scann.nextInt();  
        while(aposta < 0 || aposta >2){
            System.out.println("Escoge una opcion  0 (PEDRA), 1 (PAPER) o 2 (TISORES)");
            aposta=scann.nextInt();
        }
        return aposta;
    }

    static void mostrarGuanyadorPartida(String[] nomsJugadors, int[] tornsGuanyats, int guanyador) {
        
        System.out.println("Jugador "+nomsJugadors[0]+"ha ganado "+ tornsGuanyats[0]);
        System.out.println("Jugador "+nomsJugadors[1]+"ha ganado "+ tornsGuanyats[1]);
        System.out.println("a guanyat "+nomsJugadors[guanyador]);
    }
    static void mostrarTitol(String titolPantalla){
        System.out.println("Titol "+titolPantalla);     
    }
    
    static void mostrarError(String missatge){       
        System.out.println("Error "+missatge);  
    }
}