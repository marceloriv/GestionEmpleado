
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public abstract class Productos implements Calculable{
    
    protected String nombre,descripcion;
    protected int codigo, precio;

    public Productos(String nombre, String descripcion, int codigo, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", codigo=" + codigo + ", precio=" + precio + '}';
    }
    @Override
    public int calcularPrecioFinal(){
        int precioFinal=0;
        precioFinal = getPrecio()-(int)(getPrecio()*DESCUENTO);
        return precioFinal;
        
    }
    
    public abstract int contarProducto(ArrayList listaProductos);
    
    
    
    
    
}
