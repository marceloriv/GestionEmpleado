
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public class Alimentos extends Productos{
    
    private char tipo;
    private float pesoEnGramos;

    public Alimentos(char tipo, float pesoEnGramos, String nombre, String descripcion, int codigo, int precio) {
        super(nombre, descripcion, codigo, precio);
        this.tipo = tipo;
        this.pesoEnGramos = pesoEnGramos;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getPesoEnGramos() {
        return pesoEnGramos;
    }

    public void setPesoEnGramos(float pesoEnGramos) {
        this.pesoEnGramos = pesoEnGramos;
    }

    @Override
    public String toString() {
        return super.toString()+"Alimentos{" + "tipo=" + tipo + ", pesoEnGramos=" + pesoEnGramos + '}'+" precio final "+calcularPrecioFinal();
    }

    @Override
    public int contarProducto(ArrayList listaProductos) {
        return listaProductos.size();

    }
    
    
    
}
