package com.dev.producto;

/**
 * @author marcos.hernandez
 */
public class Producto {

    // Atributos de clase
    private Long idProducto;

    private String fabricante;

    private String nombre;

    private int precio;

    // Constructor vacio
    public Producto() {
    }

    // Constructor sobrecargado
    public Producto(Long idProducto, String fabricante, String nombre, int precio) {
        this.idProducto = idProducto;
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodos getter y setters
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
