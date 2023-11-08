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
public class DAOProveedor {
    public  Proveedor INSERTAR (String company, int telefono, String correo_elec){
        String transaccion = "INSERT INTO Proveedor(company, telefono, correo_elec) VALUES('"
                + company + "','"
                + telefono + "','"
                + correo_elec + "','";
        //Llama al método Actualizar ubicado en DataBase.java
        if (new DataBase().Actualizar(transaccion)>0){
            return new Proveedor(company, telefono, correo_elec);
        }
        return null;
    }
    
    
    public int Actualizar(int id, String company, int telefono, String correo_elec){
        
        
        String transaccion = "UPDATE Proveedor SET company='"
                + company + "', telefono='"
                + telefono + "', correo_elec='"
                + id;
        return new DataBase().Actualizar(transaccion);
        
    }
    
    
    public List ObtenerDatos(){
        String transaccion = "SELECT * FROM Proveedor";
        //Llama a método Listar de DataBase.java
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Proveedor> proveedores = new ArrayList();
        
        
      for (Map registro : registros){
          Proveedor aut = new Proveedor ((int) registro.get("id_proveedor"),
          (String)registro.get("company"),
          (int)registro.get("telefono"),
          (String)registro.get("correo_elec"));
          proveedores.add(aut);
      }
      return proveedores;
    }
    
    public int Eliminar(int id){
        String transaccion= "DELETE FROM Proveedor WHERE id_proveedor='"+ id +"'";
        
        return new DataBase().Actualizar(transaccion);
    }
    
}

