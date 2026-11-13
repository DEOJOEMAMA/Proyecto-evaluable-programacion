public class FinalNeutro {

    public static void historiaNeutra(){

        TextoMod.imprimirConDelay("\nTras abandonar la ciudad volverias a encontrarte un panorama que ya has visto antes." +
                "\nTe encuentras un pueblo que ha sido reducio a cenizas. Tras investigar un poco encuentras cadaveres de" +
                "\nla Hermandad de Acero, entre ellos hay una serie de códigos de seguridad.\n",TextoMod.azul , 10);

        Inventario.itemToInv("Código de seguridad");

        TextoMod.imprimirConDelay("\nTras saquear los restos del pueblo te encuentras con una puerta acorazada," +
                " esta parece que no sería posible abrirla a la fuerza, tras inspeccionarla un poco te das cuenta que hay un acceso mediante un código de seguridad",TextoMod.azul,10);


        if (Inventario.tieneItem("Código de seguridad")) {

            System.out.println("Código aceptado\nAbriendo puertas");

            TextoMod.imprimirConDelay("Tras abrirse la puerta alcanzarías a ver una especie de pedestal con armas y curaciónes",TextoMod.azul,10);

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
                "\nTras prepararte y equiparte las armas te dirijirias con el resto de pelotones hacia el silo." +
                "\nTras la llegada de tu peloton al silo te encontrarías con una escena muy similar a una carnicería.",TextoMod.azul , 10);

        Inventario.itemToInv("Codigo de seguridad");
    }

}
