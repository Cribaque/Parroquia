/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.conectarMysql;
import java.sql.ResultSet;

/**
 *
 * @author lenovo
 */
public class Inventario {
    public static ResultSet consultar_inventario(){
        ResultSet rs = conectarMysql.consulta_sql("call sp_consultar_inventario();");
        return rs;
    }
    
    public static ResultSet inventario_sobre_x(int monto){
        ResultSet rs = conectarMysql.consulta_sql("call sp_inventario_sobre_x("+monto+");");
        return rs;
    }
    
    public static void cambiar_estado(int id){
        String sentencia = "call sp_cambiar_estado("+id+")";
        conectarMysql.ejecutar_sentencias(sentencia);
    }
}
