package cliente;

import clases.Cocina;
import clases.HawaianaPizzaBuilder;
import clases.NapolitanaPizzaBuilder;
import clases.PizzaBuilder;

public class main {

    public static void main(String[] args) {

        Cocina cocina = new Cocina();//[Director]
        PizzaBuilder pizza_hawaiana = new HawaianaPizzaBuilder();//[Polimorfismo]
        PizzaBuilder pizza_napolitana = new NapolitanaPizzaBuilder();//[Polimorfismo]

        //Construcción de la Pizza Hawaiana
        System.out.println("---------------------------");
        System.out.println("--     PIZZA HAWAINA     --");
        System.out.println("---------------------------");

        cocina.setPizzaBuilder(pizza_hawaiana);
        cocina.construirPizza();

        System.out.println(cocina.getPizza().toString());
        System.out.println("");

        //Construcción de la Pizza Napolitana
        System.out.println("---------------------------");
        System.out.println("--    PIZZA NAPOLITANA   --");
        System.out.println("---------------------------");
        cocina.setPizzaBuilder(pizza_napolitana);
        cocina.construirPizza();

        System.out.println(cocina.getPizza().toString());
        System.out.println("--------------------------");

    }

}
