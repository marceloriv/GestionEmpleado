/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC4
 */
public class Test {
    
    public static void main(String[] args) {
        Alimentos alimento1 = new Alimentos('L', 850.5f, "ALULA","LECHE HIDROLIZADA", 123, 26_000);
        Alimentos alimento2 = new Alimentos('L', 850.5f, "PEDIASURE","LECHE CARA", 456, 22_000);
        
        RegistroProductos registro = new RegistroProductos();
        registro.agregarProductos(alimento1);
        registro.agregarProductos(alimento2);
        registro.listar();
        System.out.println((registro.buscarProductos(123))?"PRODUCTO ENCONTRADO":"PRODUCTO NO ENCONTRADO");
        System.out.println((registro.eliminarProductos(123))?"PRODUCTO ELIMINADO":"PRODUCTO NO ENCONTRADO");
        registro.listar();
        System.out.println("CANTIDAD DE PRODUCTOS "+ alimento1.contarProducto(registro.getListaProductos()));
                
    }
    
}
