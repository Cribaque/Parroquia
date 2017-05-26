/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.conectarMysql;
import java.sql.*;

/**
 *
 * @author lenovo
 */
public class Parroquia {
    public static ResultSet consultarDatos(){
        ResultSet rs = conectarMysql.consulta_sql("call sp_parroquia_con_diocesis();");
        return rs;
    }
    
    public static void insertar_parroquia(String nombre, int dio){
        String sentencia = "call sp_insertar_parroquia('"+nombre+"', "+dio+");";
        conectarMysql.ejecutar_sentencias(sentencia);
    }
    
}
