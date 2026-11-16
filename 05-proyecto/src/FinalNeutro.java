public class FinalNeutro {

    public static void historiaNeutra(){

        TextoMod.imprimirConDelay("\nTras abandonar la ciudad volverias a encontrarte un panorama que ya has visto antes." +
                "\nTe encuentras un pueblo que ha sido reducio a cenizas. Tras investigar un poco encuentras cadaveres de" +
                "\nla Hermandad de Acero, entre ellos hay una serie de códigos de seguridad.\n",TextoMod.azul , 10);



        Inventario.itemToInv("Código de seguridad");

        TextoMod.imprimirConDelay("\nTras saquear los restos del pueblo te encuentras con una puerta acorazada," +
                "\nesta parece que no sería posible abrirla a la fuerza, tras inspeccionarla un poco te das cuenta que hay un acceso mediante un código de seguridad",TextoMod.azul,10);


        if (Inventario.tieneItem("Código de seguridad")) {

            System.out.println("Código aceptado\nAbriendo puertas");

            TextoMod.imprimirConDelay("Tras abrirse la puerta alcanzarías a ver una especie de pedestal con armas y curaciónes.\nEn el pedestal te encontrarias un AK74 y varios estimulantes",TextoMod.azul,10);

            Inventario.itemsToInv("AK74");
            Inventario.itemsToInv("Estimulante");

        }

        Eleccion.elecNeutro1();

        TextoMod.imprimirConDelay("...\n...\n...",TextoMod.azul , 10);
        TextoMod.imprimirConDelay("Has llegado al silo.\nTras analizar la zona, escuchas disparos en la entrada principal" +
                "\njunto a gritos de la Hermandad de Acero y la Legión de Cesar. " +
                "\nTe adentras en el Silo Omega por los conductos de ventilación mientras la Hermandad y " +
                "\nla Legión se matan entre sí en la superficie.",TextoMod.azul , 10);

        Combate.cbt();

        System.out.println();

        Eleccion.elecNeutro2();



    }

    public static void salirFaccHist(){

        TextoMod.imprimirConDelay("\n Tras llegar a la base, el líder de la facción te hablaria sobre el asalto que van a realizar dentro de poco al silo Omega. " +
                "\n Tras la charla ves que se han dejado una serie de codigos de seguridad",TextoMod.azul, 10);

        Inventario.itemToInv("Codigo de seguridad");

        TextoMod.imprimirConDelay("\nTras prepararte y equiparte las armas te dirijirias con el resto de pelotones hacia el silo." +
                "\nTras la llegada de tu peloton al silo te encontrarías con una escena muy similar a una carnicería.",TextoMod.azul , 10);

        if (Inventario.tieneItem("Codigo de seguridad")){

            TextoMod.imprimirConDelay("Tras introducir el código la puerta se abriría lentamente y " +
                    "\ntu peloton se adentraría dentro del complejo sin causar ruido." +
                    "\nTras un rato dentro del silo, te darías cuenta que el pasillo está extrañamente vacio, de forma continua " +
                    "\nun compañero del peloton tropieza por un cable, sientes que algo va mal he intentas avisar a todos que se tiren al suelo" +
                    "\npero es muy tarde, ( explotan las granadas atadas a esos cables ) " +
                    "\n" +
                    "\nEstas recuperando la consciencia poco a poco, te pitan los oidos y alcanzas a ver a tus superiores pasar por encima tuya." +
                    "\nLlegas a escuchar de tus superiores ( Estos ya cumplieron su papel de carne de cañon).",TextoMod.azul,10);

            System.out.println("--- ¿Que decides hacer? ---\n1.Permaneces acostado en el suelo y desertas\n2.Vengar a tus compañeros");

            int a = Eleccion.respuestas();

            if (a==1){

                TextoMod.imprimirConDelay("Te llenas de rabia al enterarte que tus superiores solo estaban reclutando a carne de cañon para " +
                        "\nhacerse paso por las zonas minadas. Te mantendrias en el suelo hasta que se vayan y poco más tarde desertarias.",TextoMod.azul,10);

                Eleccion.elecNeutroFin();

            }else if(a==2){

                if (Eleccion.unirFacc==2){

                    Combate.cbt(0);

                }else if (Eleccion.unirFacc==1){

                    Combate.cbt(1);

                }

                TextoMod.imprimirConDelay("\nConsigues sobrevivir el encuentro con tus superiores a duras penas." +
                        "\nAl intentar salir una granada restante explota y te impactaria la metralla." +
                        "\nSobrevives y sigues con tu camino al exterior.",TextoMod.azul, 10);

                Eleccion.elecNeutroFin();

            }


        }else {

            TextoMod.imprimirConDelay("Al no poseer los códigos de seguridad tu y tu peloton colocarian explosivos en la puerta acorazada." +
                    "\n3, 2, 1\nSurge una explosión y la puerta acorazada se derrumbaría como pedazos, debido al ruido un peloton de la facción enemiga " +
                    "\nque se encontraba dentro sale junto a uno de sus generales", TextoMod.azul, 10);

            if (Eleccion.unirFacc==1){

                Combate.cbt(0);

            }else if (Eleccion.unirFacc==2){

                Combate.cbt(1);

            }

            TextoMod.imprimirConDelay("Tras el duro combate que has tenido que luchar acabarias mal herido." +
                    "\nApenas caminar un par de pasos te acabarias desplomando por falta de sangre." +
                    "\n...\nAl despertar hueles un olor a putrefacto, escuchas unas llaves acercarse pero no ves nada, para ti todo está oscuro" +
                    "\nsientes como te agarran y arrastran para posteriormente dejarte cerca de una pared. " +
                    "\nEscuchas rifles ser cargados y lo último que sientes son los ensordecedores disparos atravesar tu espalda." ,TextoMod.azul, 10);

            TextoMod.imprimirConDelay("Felicidades, has desbloqueado una varianre del final neutro" ,TextoMod.azul, 10);
            TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⠿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⣤⣤⣴⣿⠟⠁⠀⠈⠛⠿⣿⣿⣶⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⢀⣴⣶⣇⠀⢀⣴⣿⠟⠉⠉⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⠈⠉⠻⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢀⣿⡟⠙⢿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠸⣿⡇⠀⠀⠀⠀⠀⢀⡴⠶⢦⣄⣀⣤⠾⠛⠛⣧⡀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢠⣿⣇⠀⠀⠀⠀⣴⠋⠀⠀⠀⠈⠉⠁⠀⠀⠀⠈⠻⣦⣤⡤⠶⠻⢿⣦⠀⠀⢻⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢸⣿⠉⢳⣶⢶⡿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠘⣿⣄⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠄⠀⠀⠀⠀⢠⡼⠋⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⢹⡿⠁⠀⢀⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠠⣝⢦⡀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢀⣿⠇⠀⠀⠘⣿⠇⠀⠀⢀⠎⠀⠀⠀⠘⠛⠛⠿⠆⠀⠀⠀⠀⠠⣝⢧⡳⡄⣸⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢸⣿⠀⠀⠀⠀⠀⠀⢠⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢢⣜⢷⣽⣷⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢸⡏⠀⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠆⣹⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢸⣇⠀⠀⠀⠀⠀⠀⠈⠛⠂⠀⠀⠀⠀⢠⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⢸⣿⠀⠀⣾⣤⣀⣀⣀⢀⣀⣀⣀⡤⠔⠚⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⣿⣇⠀⠻⠳⢤⣈⣉⠉⠉⠀⣀⣀⣤⠖⠋⠟⠀⠀⠀⠀⠀⠀⢀⣀⣠⣾⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⠘⣿⣆⠀⠀⠀⠈⠙⣛⣛⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⠀⠘⢿⣧⡀⠀⠀⠈⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⠀⠀⠈⠻⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠈⠙⠿⣿⣶⣦⣤⣤⣤⣤⣶⣶⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);
            TextoMod.imprimirConDelay("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",TextoMod.amarillo,0);

            VidaYPersonaje.hp-=VidaYPersonaje.hpMax;

        }
    }

}
