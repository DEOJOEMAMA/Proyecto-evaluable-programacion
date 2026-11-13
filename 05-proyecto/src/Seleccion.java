public class Seleccion {

    public static void eleccFinal(){

        if (Eleccion.unirFacc==1 && VidaYPersonaje.karma<10 && VidaYPersonaje.karma>0){

            FinalNeutro.salirFaccHist();

        }else if (Eleccion.unirFacc==1 && VidaYPersonaje.karma>10){

            FinalBueno.continuarHistoria();

        }else if (Eleccion.unirFacc==2 && VidaYPersonaje.karma<0 ){

            FinalMalo.continuarHistoria();

        }else if(Eleccion.unirFacc==2 && VidaYPersonaje.karma<10 && VidaYPersonaje.karma>0){

            FinalNeutro.salirFaccHist();

        }else if(Eleccion.unirFacc==0 && VidaYPersonaje.karma<10 && VidaYPersonaje.karma>0){

            FinalNeutro.historiaNeutra();

        }else if(Eleccion.unirFacc==0 && VidaYPersonaje.karma<0){

            FinalMalo.contiunarHistNoFacc();

        }

    }

}
