package com.dev.sistemacompra;

import com.dev.cliente.Cliente;
import com.dev.orden.OrdenCompra;
import com.dev.producto.Producto;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author marcos.hernandez
 */
public class SistemaCompra {

    public static void main(String[] args) {

        OrdenCompra compra1 = new OrdenCompra("Venta de productos al cliente");
        OrdenCompra compra2 = new OrdenCompra();
        Cliente cliente1 = new Cliente(1L, "Marcos Salvador", "Hernández", "Guadarrama");

        compra1.addProduct(new Producto(1L, "DELL", "Laptop", 8000));
        compra1.setIdOrdenCompra(1);
        compra1.setFecha(new Date());
        compra1.setCliente(cliente1);

        compra2.addProduct(new Producto(2L, "Huawei", "Mouse", 240));
        compra2.setIdOrdenCompra(2);
        compra2.setFecha(new Date());
        compra2.setCliente(cliente1);

        System.out.println("" + compra1.getDescripcion());
        System.out.println("Cliente: " + compra1.getCliente().getNombres() + " " + compra1.getCliente().getApellidoPaterno() + " " + compra1.getCliente().getApellidoMaterno());
        System.out.println("ID Cliente: " + compra1.getCliente().getIdCliente());
        System.out.println("Fecha: " + compra1.getFecha().toString());

        ArrayList<Producto> productos1 = new ArrayList<>();
        ArrayList<Producto> productos2 = new ArrayList<>();

        // Recorremos la lista de los productos
        productos1 = compra1.getProductos();
        productos2 = compra2.getProductos();

        int totalCompra1 = 0;
        int totalCompra2 = 0;

        System.out.println("Productos comprados por el cliente con ID: " + compra1.getCliente().getIdCliente() + "\n");
        for (Producto producto: productos1) {
            System.out.println("ID del Producto: " + producto.getIdProducto());
            System.out.println("Fabricante: " + producto.getFabricante());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio() + "\n");
            totalCompra1 = producto.getPrecio();
        }

        for (Producto producto: productos2) {
            System.out.println("ID del Producto: " + producto.getIdProducto());
            System.out.println("Fabricante: " + producto.getFabricante());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            totalCompra2 = producto.getPrecio();
        }
        OrdenCompra total = new OrdenCompra();
        System.out.println("\n" + "Total de la compra: $" + total.total(totalCompra1, totalCompra2));
    }
}
