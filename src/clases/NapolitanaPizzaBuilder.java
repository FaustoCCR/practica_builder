package clases;

public class NapolitanaPizzaBuilder extends PizzaBuilder {

    /*
    pizza es un objeto declarado en el 
    Builder Abstracto[PizzaBuilder]
    
    Dentro de cada metodo se asigna valores 
    para la construccion de cada producto[pizza]
    
     */
    @Override
    public void buildMasa() {

        pizza.setMasa("cocida");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("tomate freso");
    }

    @Override
    public void builRelleno() {
        pizza.setRelleno("mozzarella + albaca");

    }

}
