
public class Partida {
    public static final int EMPAT=2;
    public static final int MAQUINA=0;
    public static final int USUARI=1;
    public static final int PEDRA=0;
    public static final int PAPER=1;
    public static final int TISORA=2;

    int quinaApostaGuanya(int apostaM, int apostaU){
        if(apostaM != apostaU){
            if(apostaM == 0){
                if(apostaU == 1){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else if(apostaM == 1){
                if(apostaU == 0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else if(apostaM == 2){
                if(apostaU == 0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else{
                return 2;
            }
        }
        else{
            return 2;
        }
         // Aixo no es correcte, canviar per valor correcte!
        
    }
}