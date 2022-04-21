
/*
* @author Alejandro Santiago
*/
public class AppEAC5P1 {
    public static void main(String[] args) {
        AppEAC5P1 prg = new AppEAC5P1();
        prg.inici();
    }
    
    void inici(){
        int quiHaDeGuanyar;
        int quiDiuLafuncio;
        String resultat;
        Partida partida = new Partida();
        
        //PROVA DE quinaApostaGuanya
        quiHaDeGuanyar = Partida.USUARI;
        quiDiuLafuncio = partida.quinaApostaGuanya(Partida.PEDRA, Partida.PAPER);
        if(quiHaDeGuanyar==quiDiuLafuncio){
            resultat="OK";
        }else{
            resultat="KO";
        }
        System.out.print("Resultat calculat: ");
        System.out.print(quiDiuLafuncio);
        System.out.print(". Resultat correcte: ");
        System.out.println(quiHaDeGuanyar);
        System.out.print("Test 1 de la funció quinaApostaGuanya: ");
        System.out.println(resultat);

        quiHaDeGuanyar = Partida.MAQUINA;
        quiDiuLafuncio = partida.quinaApostaGuanya(Partida.TISORA, Partida.PAPER);
        if(quiHaDeGuanyar==quiDiuLafuncio){
            resultat="OK";
        }else{
            resultat="KO";
        }
        System.out.print("Resultat calculat: ");
        System.out.print(quiDiuLafuncio);
        System.out.print(". Resultat correcte: ");
        System.out.println(quiHaDeGuanyar);
        System.out.print("Test 2 de la funció quinaApostaGuanya: ");
        System.out.println(resultat);
        
        quiHaDeGuanyar = Partida.EMPAT;
        quiDiuLafuncio = partida.quinaApostaGuanya(Partida.PEDRA, Partida.PEDRA);
        if(quiHaDeGuanyar==quiDiuLafuncio){
            resultat="OK";
        }else{
            resultat="KO";
        }
        System.out.print("Resultat calculat: ");
        System.out.print(quiDiuLafuncio);
        System.out.print(". Resultat correcte: ");
        System.out.println(quiHaDeGuanyar);
        System.out.print("Test 3 de la funció quinaApostaGuanya: ");
        System.out.println(resultat);
        
        //TEST de demanarQuantesJugades
        int numJugades;
        System.out.println();
        System.out.println();
        
        //Porvar de seleccionar un valor fora de rang i finalment un dins del rang (3-5)
        numJugades = UtilsES.demanarQuantesJugades();
        System.out.print("Has demanat de fer ");
        System.out.print(numJugades);
        System.out.println(" jugades");
        
        //TEST de demanarAposta
        int aposta;
        System.out.println();
        System.out.println();
        
        //Porvar de seleccionar un valor fora de rang i finalment un dins del rang (0-2)
        String[] apostes = {"PEDRA", "PAPER", "TISORES"};
        aposta = UtilsES.demanarAposta();
        System.out.print("Has apostat per ");
        System.out.println(apostes[aposta]);
        
        //TEST de mostrarTitol
        UtilsES.mostrarTitol("Identificació del jugador.");
        System.out.println();
        System.out.println();
        
        //TEST de mostrarError
        UtilsES.mostrarError("No s'ha pogut emmagatzemar el nom del jugador!");
        System.out.println();
        System.out.println();
        
        //TEST de mostrarGuanyadorPartida
        String[] nomsJugadors = {"Màquina", "Anna"};
        int[] tornsGuanyats = {2,2};
        int guanyador = Partida.EMPAT;
        System.out.println();
        System.out.println();
        System.out.println("++++ EMPAT ++++");
        
        UtilsES.mostrarGuanyadorPartida(nomsJugadors, tornsGuanyats, guanyador);
        
        tornsGuanyats[Partida.MAQUINA] = 1;
        tornsGuanyats[Partida.USUARI] = 3;
        guanyador = Partida.USUARI;
        System.out.println();
        System.out.println();
        System.out.println("++++ USUARI ++++");

        UtilsES.mostrarGuanyadorPartida(nomsJugadors, tornsGuanyats, guanyador);
        
        tornsGuanyats[Partida.MAQUINA] = 2;
        tornsGuanyats[Partida.USUARI] = 1;
        guanyador = Partida.MAQUINA;
        System.out.println();
        System.out.println();
        System.out.println("++++ MAQUINA ++++");

        UtilsES.mostrarGuanyadorPartida(nomsJugadors, tornsGuanyats, guanyador);
    }
}