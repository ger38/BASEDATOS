
package modelo;

import java.util.Objects;


public class Tortilla {
    private int id;
    private String nombre;
    private double precio;
    
    public Tortilla(){
        
    }
    public Tortilla(int id, String nombre, double precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public int getId(){
     return id;   
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    
    public String toString(){//EL TOSTRING NOS DEVUELVE LOS DATOS QUE PEDIMOS
        return nombre + " --> $" + precio + "id: " + id;        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tortilla other = (Tortilla) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}


