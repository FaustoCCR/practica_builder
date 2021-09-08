
package clases;

// Clase producto Pizza
public class Pizza {
    
    //atributos
    private String masa;
    private String salsa;
    private String relleno;


    //Metodos seters
    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }


    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    
    
    @Override
    public String toString(){
        
        return "Composición de la Pizza" 
                + "\nMasa : "+ masa 
                + "\nSalsa : " + salsa 
                + "\nRelleno : " + relleno;
    }
    
    
    
    
    

    
}
