
package clases;

//Constructor abstracto del producto[Clase Pizza]
public abstract class PizzaBuilder {
    
    //Objeto de la clase Pizza
    protected Pizza pizza;
    
    //Metodos concretos
    public Pizza getPizza() {
        return pizza;
    }

    public void crearNuevaPizza(){
        //crea una instancia de la clase
        this.pizza = new Pizza();
    }
    
    //Metodos abstractos
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void builRelleno();
    
    
    
}
