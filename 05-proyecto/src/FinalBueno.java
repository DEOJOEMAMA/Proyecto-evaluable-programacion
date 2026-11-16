

public class FinalBueno {

    public static void continuarHistoria(){

        TextoMod.imprimirConDelay("Los caballeros de la Hermandad te reciben con honores y te entregan armamento " +
                "\nreglamentario para limpiar el sector científico." +
                "\nTras un rato de caminar junto al resto de reclutas llegarias al puesto de avanzada." +
                "\nLos pesados portones hidráulicos del puesto de avanzada se abren con un siseo metálico. Un escuadrón de Paladines " +
                "\nenfundados en sus imponentes Servoarmaduras T-60 te escolta hasta el salón de mando. El Centinela al cargo examina " +
                "\ntu equipo y asiente con respeto.",TextoMod.azul, 10);

        System.out.println("--- Un centinela te habla ---");
        TextoMod.imprimirConDelay("Has sobrevivido ahí fuera por tus propios medios, pero el verdadero enemigo acaba de despertar." +
                "\nNuestros sensores han detectado actividad en el Silo Omega. Toma esta M16 de apoyo y un par de estimulantes. Si ese arsenal cae en malas manos, " +
                "\nno quedará nada que salvar.", TextoMod.azul, 10);

        Inventario.itemsToInv("M16");
        Inventario.itemsToInv("Estimulante");
        Inventario.itemsToInv("Estimulante");

        Habitaciones.habitaciones();

        TextoMod.imprimirConDelay("Tras llegar con todos tus compañeros al silo omega entrariais por una red de ascensores oculta." +
                "\n--- Lider de pelotón ---" +
                "\nNuestro objetivo es entrar de manera oculta mientras nuestras fuerzas principales se quedan atras luchando contra su general." +
                "\nTe doy dos opciones.\n1.Quedarte con tu peloton\n2.Ir a la entrada principal e intentar eliminar al general",TextoMod.azul, 10);

        if (Eleccion.respuestas()==1){

            TextoMod.imprimirConDelay("Decides quedarte junto a tu peloton y bajar " +
                    "\nDescendéis en ascensor de carga hacia las entrañas de la antigua base militar de pre-guerra. El aire huele a ozono y aceite quemado. " +
                    "\nEn el centro de la sala de mando principal descansa la inmensa consola de lanzamiento del Silo Omega, iluminada por decenas de luces ámbar " +
                    "\ny pantallas de radar que apuntan a todo el territorio.",TextoMod.azul,10);

            TextoMod.imprimirConDelay("Las alarmas perimetrales comienzan a sonar: las avanzadillas de la Legión intentan derribar los mamparos superiores. " +
                    "\nMientras los Paladines contienen el asedio en los pasillos, debes asegurar la terminal principal sin provocar una detonación accidental de los reactores.",TextoMod.azul,10);

            if (!Inventario.tieneItem("Cables")){

                TextoMod.imprimirConDelay("Mediante la asistencia de tus aliados, accedes al núcleo lógico del sistema. Las pantallas te piden confirmar el protocolo de lanzamiento, pero siguiendo el juramento " +
                        "\nde la Hermandad, introduces la secuencia de desarmado global." +
                        "\nAntes de que pudiese iniciar la secuencia final uno de tus compañeros centinela se revelaria como espia y eliminaria a dos de tus compañeros",TextoMod.azul,10);

                Combate.cbt(2);

            }else {

                TextoMod.imprimirConDelay("Accedes al núcleo lógico del sistema del Silo Omega. Las pantallas parpadean exigiendo una autorización de desactivación de emergencia. " +
                        "\nPara cortar los circuitos de ignición de las ojivas sin provocar un cortocircuito letal, inspeccionas los paneles abiertos del terminal." +
                        "\nEncuentras los cables en tu mochila y los conectas con precisión quirúrgica en los bornes principales del panel. " +
                        "\nEl flujo eléctrico se estabiliza y la secuencia de desarmado global se ejecuta sin contratiempos, apagando todas las ojivas nucleares." +
                        "\nMientras estabas concentrado al intentar desactivar la ojiva nuclear tus compañeros de pelotón detuvieros a un espia de la legión",TextoMod.azul,10);

                TextoMod.imprimirConDelay("El zumbido ensordecedor de las turbinas del silo se detiene por completo, sumiendo la sala en un silencio reparador. " +
                        "\nSin el poder de fuego atómico para sostener su ofensiva, las fuerzas hostiles de la superficie se baten en retirada. Por primera vez en décadas, " +
                        "\nlos cielos del Yermo están a salvo." +
                        "\n..." +
                        "\nGracias a tu decisión de desarmar el Silo Omega, la Hermandad de Acero logra restablecer el orden y proteger las rutas comerciales y asentamientos libres. " +
                        "\nTu hazaña corre de boca en boca por cada cantina y refugio: tu nombre se ha convertido en una leyenda eterna como el verdadero salvador de la humanidad.", TextoMod.azul, 10);

                System.out.println("Has desbloqueado el final bueno, enhorabuena te has pasado el juego");
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

            }



        }else {

            TextoMod.imprimirConDelay("Al no poseer los códigos de seguridad tu y tu peloton colocarian explosivos en la puerta acorazada." +
                    "\n3, 2, 1\nSurge una explosión y la puerta acorazada se derrumbaría como pedazos, debido al ruido un peloton de la facción enemiga " +
                    "\nque se encontraba dentro sale junto a uno de sus generales", TextoMod.azul, 10);

            Combate.cbt(0);

            TextoMod.imprimirConDelay("Tras el duro combate, las tropas rezagadas de la legión se rendirian tras haber caído su general" +
                    "\nTras diez minutos de espera te llegan las noticias que tu pelotón anterior no ha sido capad de cumplir la misión y debido a un espia." +
                    "\nDecides adentrarte en el silo para desactivar la ojiva nuclear." +
                    "\nLlegas al panel de control.\n" +
                    "\n --- Hackeo del silo ---", TextoMod.azul, 10);

            boolean ga = Ahorcado.jugarAhorcado();

            if (ga==true){

                TextoMod.imprimirConDelay("Logras desactivar la ojiva a tiempo y eres capaz de descansar." +
                        "\nTras llegar a la base tus superiores te condecorarian con la medalla del salvador del yermo.\n" +
                        "\n\"Has desbloqueado el final bueno", TextoMod.azul, 10);

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

            }else {

                TextoMod.imprimirConDelay("No consigues desactivar la ojiva y el misil detona. En los últimos instantes de tu \n" +
                        "vida te arrepientes de haber dejado a tu platón de lado.\n" +
                        "Has desbloqueado la variante mala del final bueno", TextoMod.azul, 10);

            }

        }
    }

}
