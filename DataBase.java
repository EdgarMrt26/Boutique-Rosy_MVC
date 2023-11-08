/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_;

import java.sql.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class DataBase {
    //cadena de conexión de la BD publicacion en MYSQL
    private final String URL="jdbc:mysql://localhost/dbgustavo";
    private final String user="dbgustavo";
    private final String password="messi12";
    
    private Connection conexion;//Para conexión con la BD

    public DataBase() {
        try{
            conexion=DriverManager.getConnection(URL, user, password);
            System.out.println("Conexión Establecida");
        }catch(SQLException e){
            System.out.println("Error de Conexión");
            e.printStackTrace();
        }
   }   
    
    public int Actualizar (String consulta){
        
     try{//Para manejar errores al realizar la conexión  y transacción en BD   
        Statement st=conexion.createStatement();
        return st.executeUpdate(consulta);
     }catch(SQLException e){
         
     e.printStackTrace();
     }
     return 0;
        
        
        
    }
    
    
   
    private List OrganizarDatos(ResultSet rs){
        List filas= new ArrayList();//Arreglo de elementos
        try{
            int numColumnas=rs.getMetaData().getColumnCount();
            while(rs.next()){//Recorre cada registro de la tabla
                Map<String, Object> renglon=new HashMap();
                for(int i=1; i<=numColumnas; i++){
                    //Se obtiene nombre de campo de la BD
                    String nombreCampo=rs.getMetaData().getColumnName(i);
                    Object valor=rs.getObject(nombreCampo);
                    //por cada campo, se obtiene el nombre y el valor del mismo
                    renglon.put(nombreCampo, valor);
                }
                filas.add(renglon); //se agrega al arreglo cada registro
            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return filas;
    } 
    
    public List Listar(String consulta){
        ResultSet rs=null;
        List resultado=new ArrayList();
        
        try{
            Statement st=conexion.createStatement();
            rs=st.executeQuery(consulta);
            resultado=OrganizarDatos(rs);
            
        }catch(SQLException e){
            System.out.println("No se realizó la consulta");
            e.printStackTrace();
        }
        
        return resultado;
        
        
        
    }
    
    private void cerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException e){
        e.printStackTrace();
        
        }
    }
}
