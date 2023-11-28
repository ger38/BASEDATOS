
package modelo;

import java.util.Objects;


public class Alimento {
    private int id;
    private String nombre;
    private double precio;
    
    public Alimento(){  //CONSTRUCTOR VACIO 
    }
    
    public Alimento(String nombre, double precio){//CONSTRUCTOR PARA AGREGAR
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public Alimento(int id, String nombre, double precio){//CONSTRUCTOR PARA ACTUALIZAR
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
    
    @Override
    public String toString(){
        return "Alimento{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alimento other = (Alimento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
        
    
}
    

