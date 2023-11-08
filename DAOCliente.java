/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_;
import java.util.*;
/**
 *
 * @author PC
 */
public class DAOCliente {
    
    
    public Cliente Insertar (String direccion, String client_nombre, String client_apellido, String num_telefono,
            String correo_elect, String categoria){
        String transaccion = "INSERT INTO Cliente (direccion, client_nombre, client_apellido, num_telefono, correo_elect,categoria) VALUES('"
                + client_nombre + "','"
                + client_apellido + "','"
                + num_telefono + "','"
                + correo_elect + "','"
                + categoria + "')";
        
        if (new DataBase().Actualizar(transaccion)>0){
            return new Cliente(client_nombre, client_apellido, direccion, num_telefono, correo_elect, categoria);
        }
        return null;
    }
    
    
    public int Actualizar(int id_cliente, String client_nombre, String client_apellido, String direccion, String num_telefono, 
            String correo_elect, String categoria){
        
        
        String transaccion = "UPDATE Cliente SET client_nombre='"
                + client_nombre + "',client_apellido='"
                + client_apellido + "',direccion='"
                + direccion + "',num_telefono='"
                + num_telefono + "',correo_elect='"
                + correo_elect + "',categoria='"
                + categoria + "'WHERE id_cliente="
                + id_cliente;
        return new DataBase().Actualizar(transaccion);
                
    }
    
    
    
    public List ObtenerDatos(){
        String transaccion = "SELECT * FROM Cliente";
        
        List<Map>registros = new DataBase().Listar(transaccion);
        List<Cliente> clientes = new ArrayList();
        
        for (Map registro : registros){
            Cliente aut = new Cliente((int)registro.get("id_cliente"),
            (String)registro.get("client_nombre"),
            (String)registro.get("client_apellido"),
            (String)registro.get("direccion"),
            (String)registro.get("num_telefono"),
            (String)registro.get("correo_elect"),
            (String)registro.get("catororia"));
            
            clientes.add(aut);
        }
        return clientes;
    }
    
    public int Eliminar(int id){
        String transaccion = "DELETE FROM Cliente WHERE id_cliente='"+ id +"'";
        
        return new DataBase().Actualizar(transaccion);
    }
}
