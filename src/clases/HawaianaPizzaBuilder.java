package clases;

public class HawaianaPizzaBuilder extends PizzaBuilder {

    /*
    pizza es un objeto declarado en el 
    Builder Abstracto[PizzaBuilder]
    
    Dentro de cada metodo se asigna valores 
    para la construccion de cada producto[pizza]
    
    */
    @Override
    public void buildMasa() {
        
        pizza.setMasa("suave");
    }
    
    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }
    
    @Override
    public void builRelleno() {
        pizza.setRelleno("piña + jamón");
        
    }
    
}
