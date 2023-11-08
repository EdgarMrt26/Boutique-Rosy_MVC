/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_;
/**
 *
 * @author PC
 */
public class Cliente {
    
    private  int id_cliente;
    private String client_nombre;
    private String client_apellido;
    private String direccion;
    private String num_telefono;
    private String correo_elect;
    private String categoria;

    public Cliente(int id_cliente, String client_nombre, String client_apellido, String direccion, String num_telefono, String correo_elect, String categoria) {
        this.id_cliente = id_cliente;
        this.client_nombre = client_nombre;
        this.client_apellido = client_apellido;
        this.direccion = direccion;
        this.num_telefono = num_telefono;
        this.correo_elect = correo_elect;
        this.categoria = categoria;
    }

    public Cliente(String client_nombre, String client_apellido, String direccion, String num_telefono, String correo_elect, String categoria) {
        this.client_nombre = client_nombre;
        this.client_apellido = client_apellido;
        this.direccion = direccion;
        this.num_telefono = num_telefono;
        this.correo_elect = correo_elect;
        this.categoria = categoria;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getClient_nombre() {
        return client_nombre;
    }

    public void setClient_nombre(String client_nombre) {
        this.client_nombre = client_nombre;
    }

    public String getClient_apellido() {
        return client_apellido;
    }

    public void setClient_apellido(String client_apellido) {
        this.client_apellido = client_apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getCorreo_elect() {
        return correo_elect;
    }

    public void setCorreo_elect(String correo_elect) {
        this.correo_elect = correo_elect;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
