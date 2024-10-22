
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public class RegistroProductos {
    
    private ArrayList<Productos> listaProductos;

    public RegistroProductos() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }
    
    
    
    public boolean agregarProductos(Productos producto){
        return listaProductos.add(producto);
    }
    
    public void listar(){
        System.out.println("RESUMEN PRODUCTOS");
        System.out.println("*****************");
        for (Productos i : listaProductos) {
            System.out.println(i);
        }
    }
    
    public boolean buscarProductos(int codigo){
        for (Productos i : listaProductos) {
            if (i.getCodigo()==codigo) {
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarProductos(int codigo){
        for (Productos i : listaProductos) {
            if (i.getCodigo()==codigo) {
                listaProductos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
}
