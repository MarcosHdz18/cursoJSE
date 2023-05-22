package com.dev.orden;

import com.dev.cliente.Cliente;
import com.dev.producto.Producto;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author marcos.hernandez
 */
public class OrdenCompra {

    // Atributos de clase
    private Integer idOrdenCompra;

    private String descripcion;

    private Date fecha;

    private Cliente cliente;

    private ArrayList<Producto> productos;

    // Constructor vacio
    public OrdenCompra() {
    }

    // Constructor sobrecargado
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    // Metodos getter y setter
    public Integer getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProduct(Producto producto) {

        this.productos = new ArrayList<>();

        Producto agregarProducto = new Producto();

        agregarProducto.setIdProducto(producto.getIdProducto());
        agregarProducto.setFabricante(producto.getFabricante());
        agregarProducto.setNombre(producto.getNombre());
        agregarProducto.setPrecio(producto.getPrecio());

        this.productos.add(agregarProducto);
    }

    // Total de la compra
    public Integer total(int compraProducto1, int compraProducto2) {
        int total = 0;
        return total = compraProducto1 + compraProducto2;
    }
}
