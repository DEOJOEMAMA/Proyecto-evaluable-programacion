public class FinalMalo {

    public static void continuarHistoria(){

        TextoMod.imprimirConDelay("Las antorchas iluminan las tiendas de campaña rojas y negras alzadas entre las ruinas. " +
                "\nTe arrodillas ante el Legado, cuya armadura está cubierta de cicatrices y trofeos de guerra. El aire huele a humo, " +
                "\nsangre y hierro forjado.\n" +
                "\n" +
                "LEGADO:\n" +
                "Los débiles se esconden tras muros de acero y tecnología que no comprenden. Nosotros forjaremos un nuevo imperio sobre sus cenizas. " +
                "\nDemuestra tu lealtad absoluta a César y toma el control del Silo Omega para purgar esta tierra.", TextoMod.azul, 10);

        TextoMod.imprimirConDelay("Te acercas a la armeria y te equipas con armas de gran calibre y curaciones", TextoMod.azul, 10);

        Inventario.itemsToInv("Estimulante");
        Inventario.itemsToInv("Estimulante");
        Inventario.itemsToInv("AK74");
        Inventario.itemsToInv("Balas rifle");

        TextoMod.imprimirConDelay("\nEncabezas el asalto frontal contra el búnker subterráneo. Entre gritos de guerra " +
                "\ny cargas explosivas, arrasáis las defensas exteriores sin mostrar piedad. Al llegar a la sala de control central, " +
                "\nlos últimos técnicos de pre-guerra retroceden aterrorizados ante el brillo de la consola del Silo Omega." +
                "\nSe abre una puerta y aparece un comandante de acero equipado con una armadura T60. ", TextoMod.azul, 10);

        Combate.cbt(1);

        TextoMod.imprimirConDelay("Tras el combate apartas los cuerpos de la consola y tomas el mando del mapa táctico global. " +
                "\nLos puntos verdes en el radar señalan los refugios libres, los puestos de la Hermandad y los asentamientos de supervivientes independientes", TextoMod.azul, 10);

        System.out.println("--- ¿Qué quieres hacer? --- \n1. Fijar los objetivos directamente sobre los grandes refugios civiles para sembrar el pánico total." +
                "\n2. Apuntar todo el arsenal contra las bases militares rivales para aniquilar cualquier posible resistencia.");

        if (Eleccion.respuestas()==1){

        TextoMod.imprimirConDelay("Apartas los cuerpos de los técnicos de la consola y tomas el control total del mapa táctico global del Silo Omega. " +
                "\nEn las pantallas parpadean los puntos verdes que representan los refugios subterráneos donde la población civil intenta preservar lo poco que queda de la humanidad.\n" +
                "\n" +
                "Tus dedos se deslizan sobre los mandos de pre-guerra, reconfigurando los vectores balísticos de las ojivas principales para que impacten de " +
                "\nlleno contra las puertas blindadas de los refugios. No habrá tregua para los escondites subterráneos; César demanda una limpieza absoluta.\n" +
                "\n" +
                "SISTEMA (Consola del Silo):\n" +
                "Coordenadas fijadas: Refugios civiles principales. Ojivas nucleares armadas y listas para la ignición.", TextoMod.azul, 10);

        TextoMod.imprimirConDelay("Presionas el interruptor maestro de lanzamiento. Los misiles abandonan los silos subterráneos con un estruendo ensordecedor que rasga los cielos del Yermo. " +
                "\nMinutos después, a través de las cámaras de seguridad, presencias cómo las ojivas penetran los cimientos de los búnkeres subterráneos, " +
                "\ncolapsando los últimos refugios seguros de la civilización en una serie de cataclísmicas implosiones atómicas.\n" +
                "\n" +
                "FINAL MALO - LA EXTINCIÓN DE LA HUMANIDAD:\n" +
                "Has borrado todo atisbo de vida protegida bajo la tierra. Sin descendientes de los viejos refugios ni comunidades libres que puedan reconstruir el mundo, " +
                "\nel planeta entero queda sumido en una oscuridad estéril y eterna, gobernada únicamente por el miedo y las cenizas bajo el estandarte de la Legión.", TextoMod.azul, 10);



        }else if(Eleccion.respuestas()==2){

            TextoMod.imprimirConDelay("Apartas los cuerpos de los técnicos de la consola y tomas el control total del mapa táctico global del Silo Omega." +
                    "\nEn el radar militar brillan las frecuencias enemigas, balizas que señalan las bases fortificadas y los puestos de avanzada de las facciones rivales.”\n" +
                    "\n" +
                    "Programas una lluvia de fuego sincronizada sobre cada posición militar contraria, asegurándote de que ningún ejército opositor " +
                    "\npueda plantar cara al avance imperial de la Legión. Introduces los códigos de ataque masivo con fría precisión.\n" +
                    "\n" +
                    "SISTEMA (Consola del Silo):\n" +
                    "Coordenadas fijadas: Bases militares y puestos avanzados rivales. Ojivas nucleares armadas y listas para la ignición.", TextoMod.azul, 10);

            TextoMod.imprimirConDelay("Accionas la secuencia de fuego. Los misiles surcan el horizonte en un arco de fuego purpúreo y descienden en picado sobre los" +
                    "\nfuertes de la Hermandad y los campamentos de resistencia. Las detonaciones colosales desintegran las fortalezas de acero y convierten los ejércitos " +
                    "\nrivales en mares de plasma y escombros humeantes.\n" +
                    "\n" +
                    "FINAL MALO - EL IMPERIO DE CENIZA:\n" +
                    "Has aniquilado por completo toda oposición militar organizada en el mapa. Sin ejércitos que se opongan a su paso, las legiones de César marchan sin " +
                    "\nresistencia sobre los asentamientos desprotegidos, inaugurando una era de dominación absoluta donde el Yermo entero se hinca de rodillas ante un " +
                    "\nimperio construido sobre la destrucción total.", TextoMod.azul, 10);



        }


    }

}
