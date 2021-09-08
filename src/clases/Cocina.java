
package clases;

// Clase Directora
/*Esta se encargara de ocultar metodos al cliente 
ya que aquí se colocan dichos métodos y el orden
en el que estos se ejecutan*/
public class Cocina {
    
    private PizzaBuilder pizzaBuilder;
    
    public void setPizzaBuilder(PizzaBuilder pb){
        
        this.pizzaBuilder = pb;
    }
    
    public Pizza getPizza(){
        
        return pizzaBuilder.getPizza();
    }
    
    //Orden de la ejecución de métodos
    public void construirPizza(){
        
        pizzaBuilder.crearNuevaPizza();//crea el objeto de la clase pizza
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.builRelleno();
        
        
        
    }

    
}
