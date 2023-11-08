/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_;

/**
 *
 * @author PC
 */
public class Proveedor{
    
    private int id_proveedor;
    private String company;
    private int telefono;
    private String correo_elec;

    public Proveedor(int id_proveedor, String company, int telefono, String correo_elec) {
        this.id_proveedor = id_proveedor;
        this.company = company;
        this.telefono = telefono;
        this.correo_elec = correo_elec;
    }

    public Proveedor(String company, int telefono, String correo_elec) {
        this.company = company;
        this.telefono = telefono;
        this.correo_elec = correo_elec;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_elec() {
        return correo_elec;
    }

    public void setCorreo_elec(String correo_elec) {
        this.correo_elec = correo_elec;
    }

    
    
}
