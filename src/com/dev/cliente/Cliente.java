package com.dev.cliente;

/**
 * @author marcos.hernandez
 */
public class Cliente {

    // Atributos de clase
    private Long idCliente;

    private String nombres;

    private String apellidoPaterno;

    private String apellidoMaterno;

    // Constructor vacio
    public Cliente() {
    }

    //Constructor sobrecargado con todos los atributos
    public Cliente(Long idCliente, String nombres, String apellidoPaterno, String apellidoMaterno) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
